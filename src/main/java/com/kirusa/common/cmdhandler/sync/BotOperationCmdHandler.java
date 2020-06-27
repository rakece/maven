package com.kirusa.common.cmdhandler.sync;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotImage;
import com.kirusa.domain.RcsBotPublisher;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.domain.RcsBotType;
import com.kirusa.domain.RcsBotTypeDesc;
import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotVideo;
import com.kirusa.domain.RcsCountryList;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.request.Bot;
import com.kirusa.request.BotCarrier;
import com.kirusa.request.BotDesc;
import com.kirusa.request.BotDetailsCmdRequest;
import com.kirusa.request.BotImage;
import com.kirusa.request.BotPublisherData;
import com.kirusa.request.BotSettingData;
import com.kirusa.request.BotSettingRequest;
import com.kirusa.request.BotTags;
import com.kirusa.request.BotType;
import com.kirusa.request.BotUpdate;
import com.kirusa.request.BotVideo;
import com.kirusa.request.BotsCountry;
import com.kirusa.response.CmdResponse;
import com.kirusa.service.MailSenderService;
import com.kirusa.service.RcsBotAvailableService;
import com.kirusa.service.RcsBotCategoryService;
import com.kirusa.service.RcsBotDescService;
import com.kirusa.service.RcsBotImageService;
import com.kirusa.service.RcsBotPublisherService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotTagsService;
import com.kirusa.service.RcsBotTypeDescService;
import com.kirusa.service.RcsBotTypeService;
import com.kirusa.service.RcsBotUpdateDescService;
import com.kirusa.service.RcsBotUserService;
import com.kirusa.service.RcsBotVideoService;
import com.kirusa.service.RcsCountryListService;
import com.kirusa.service.RcsStorageService;
import com.kirusa.util.AppConfig;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;
import com.kirusa.service.RcsBotCarrierMappingService;
import com.kirusa.service.RcsBotCarrierService;

@Component
public class BotOperationCmdHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(BotOperationCmdHandler.class);

	@Autowired
	ApplicationContext context;

	@Autowired
	private RcsBotUserService rcsBotUserService;

	@Autowired
	private RcsCountryListService rcsCountryListService;

	@Autowired
	private RcsBotUserService rcsUserBotService;

	@Autowired
	private RcsBotService rcsBotService;

	@Autowired
	RcsBotCategoryService rcsBotCategoryService;

	@Autowired
	RcsBotTagsService rcsBotTagsService;

	@Autowired
	RcsBotTypeService rcsBotTypeService;

	@Autowired
	RcsBotTypeDescService rcsBotTypeServiceDesc;

	@Autowired
	RcsBotUpdateDescService rcsBotUpdateDescService;

	@Autowired
	private RcsBotDescService rcsBotDescService;

	@Autowired
	private RcsStorageService rcsStorageService;

	@Autowired
	private RcsBotImageService rcsBotImageService;

	@Autowired
	private RcsBotVideoService rcsBotVideoService;

	@Autowired
	RcsBotAvailableService rcsBotAvailableService;

	@Autowired
	RcsBotCarrierMappingService rcsBotCarrierMappingService;

	@Autowired
	RcsBotCarrierService rcsBotCarrierService;
	
	@Autowired
	RcsBotCarrierMappingService carrierMappingService; 

	@Autowired
	RcsBotPublisherService rcsBotPublisherService;
	
	@Autowired
	MailSenderService mailSenderService;

	private static Gson gson = new Gson();

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		// TODO Auto-generated method stub
		String res = null;
		String action = getRequiredField(jsonObject, RCSConstant.FLD_ACTION);
		if (action.equals(Cmd.FLD_CREATE_BOT)) {
			res = this.createBot(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_ALL_BOT_LIST)) {
			res = this.getBotList(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_BOT_DETAIL)) {
			res = this.getBotDetails(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_ALL_TYPE)) {
			res = this.getAllType(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_ALL_CATGORY)) {
			res = this.getAllCateogry(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_ALL_COUNTRY)) {
			res = this.getAllCountry(jsonObject, jsonData, request);
		}
		if (action.equals(Cmd.FLD_GET_ALL_CARRIER)) {
			res = this.getAllCarrierList(jsonObject, jsonData, request);
		}
		
		if (action.equals(Cmd.FLD_UPDATE_BOT_STATUS)) {
			res = this.updateBotStatus(jsonObject, jsonData, request);
		}

		return res;

	}

	private String createBot(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		BotSettingRequest botSettingReq = gson.fromJson(jsonData, BotSettingRequest.class);
		BotSettingData botSettingData = botSettingReq.getData();
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, botSettingReq.getCmd());
		RcsBotUser rcsBotUser = null;

		RcsBot rcsBot = new RcsBot();
		// get bot
		Bot bot = botSettingData.getBot();
		String botaction = bot.getAction();
		if ((bot.getRcs_bot_category_id() == null) || (bot.getRcs_bot_user_id() == null)) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_NON_EXISTING_IDENTITY,
					CmdHandlerException.ERRMSG_EMPTY_IDENTITY);
		}
		RcsBotCategory tempCategory = rcsBotCategoryService
				.findRcsBotCategoryByPrimaryKey(bot.getRcs_bot_category_id());
		rcsBot.setRcsBotCategory(tempCategory);
		RcsBotUser tempUser = rcsUserBotService.findRcsBotUserByPrimaryKey(bot.getRcs_bot_user_id());
		rcsBot.setRcsBotUser(tempUser);
		// add bot
		if (bot.getBot_id() != null)
			rcsBot.setId(bot.getBot_id());
		rcsBot.setLogoImageName(bot.getLogo_image());
		rcsBot.setOptIn(bot.getOpt_in());
		rcsBot.setOptInUrl(bot.getOpt_in_url());
		rcsBot.setOptIn(bot.getOpt_in());
		rcsBot.setPlatform(bot.getPlatform());
		rcsBot.setPrivacyUrl(bot.getPrivacy_url());
		rcsBot.setWebsiteUrl(bot.getWebsite_url());
		rcsBot.setTermAndConditionUrl(bot.getTerm_and_condition_url());
		rcsBot.setStatus(/* bot.getStatus() */"submitted");
		rcsBot.setRegisterUrl(bot.getRegister_url());
		if (botaction != null && (botaction.equals(RCSConstant.FLD_DELETE))) {
			this.deleteBot(rcsBot);
			cmdResponse.addData(RCSConstant.FLD_BOT_ID, rcsBot.getId());
			return cmdResponse.toJsonData();
		} else {
			rcsBot = rcsBotService.saveRcsBot(rcsBot);
		}
		cmdResponse.addData(RCSConstant.FLD_BOT_ID, rcsBot.getId());

		Integer botId = rcsBot.getId(); // Bot id to update

		// add description.
		ArrayList<BotDesc> botdesc = botSettingData.getBot_desc();
		for (BotDesc botDesc : botdesc) {
			String action = botDesc.getAction();
			RcsBotDesc rcsBotDesc = new RcsBotDesc();
			rcsBotDesc.setBotFeature(botDesc.getBot_feature());
			rcsBotDesc.setRcsBot(rcsBot);
			rcsBotDesc.setBotName(botDesc.getBot_name());
			rcsBotDesc.setBotSummary(botDesc.getBot_summary());
			rcsBotDesc.setDisplayName(botDesc.getDisplay_name());
			rcsBotDesc.setDescription(botDesc.getDescription());
			rcsBotDesc.setRcsBot(rcsBot);
			String locale = botDesc.getLocale();
			if (locale == null)
				locale = RCSConstant.FLD_DEFAULT_LOCALE;
			rcsBotDesc.setLang(locale);
			if (botDesc.getId() != null)
				rcsBotDesc.setId(botDesc.getId());
			if (action != null && action.equals(RCSConstant.FLD_DELETE))

				rcsBotDescService.deleteRcsBotDesc(rcsBotDesc);

			else {
				rcsBotDescService.saveRcsBotDesc(rcsBotDesc);
				context.getBean(SearchRcsBotHandler.class).addRcsBottoAutoCompleteList(rcsBotDesc);
			}

			// rcsBotService.saveRcsBotRcsBotDescs(rcsBot.getId(), rcsBotDesc);

		}
		// add tags
		ArrayList<BotTags> BotTags = botSettingData.getTags();
		ArrayList<RcsBotCategory> categoryList = new ArrayList<RcsBotCategory>();
		for (BotTags botTags : BotTags) {
			String action = botTags.getAction();
			RcsBotTags rcsBotTags = new RcsBotTags();
			RcsBotCategory tempTagCategory = rcsBotCategoryService
					.findRcsBotCategoryByPrimaryKey(botTags.getRcs_bot_category_id());
			categoryList.add(tempTagCategory);
			rcsBotTags.setRcsBotCategory(tempTagCategory);
			rcsBotTags.setRcsBot(rcsBot);
			if (botTags.getId() != null)
				rcsBotTags.setId(botTags.getId());
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotTagsService.deleteRcsBotTags(rcsBotTags);
			else

				rcsBotTagsService.saveRcsBotTags(rcsBotTags);
			// rcsBotService.saveRcsBotRcsBotTagses(rcsBot.getId(), rcsBotTags);
		}
		// add image
		ArrayList<BotImage> botImages = botSettingData.getScreen_image();
		ArrayList<String> screenImagesList = new ArrayList<String>();
		for (BotImage botImage : botImages) {
			String action = botImage.getAction();
			RcsBotImage rcsBotImage = new RcsBotImage();
			rcsBotImage.setRcsBot(rcsBot);
			rcsBotImage.setImageName(botImage.getImage_name());
			rcsBotImage.setStatus(botImage.getStatus());
			rcsBotImage.setDescription(botImage.getDescription());
			if (botImage.getId() != null)
				rcsBotImage.setId(botImage.getId());
			rcsBotImage.setRcsBot(rcsBot);
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotImageService.deleteRcsBotImage(rcsBotImage);
			else {
				rcsBotImageService.saveRcsBotImage(rcsBotImage);
				screenImagesList.add(botImage.getImage_name());
			}

		}

		// add video
		ArrayList<BotVideo> botVideos = botSettingData.getVideo();
		ArrayList<String> screenVidesList = new ArrayList<String>();
		for (BotVideo botVideo : botVideos) {
			String action = botVideo.getAction();
			RcsBotVideo rcsBotVideo = new RcsBotVideo();
			rcsBotVideo.setRcsBot(rcsBot);
			rcsBotVideo.setVideoName(botVideo.getVideo_name());
			rcsBotVideo.setStatus(botVideo.getStatus());
			rcsBotVideo.setDescription(botVideo.getDescription());
			if (botVideo.getId() != null)
				rcsBotVideo.setId(botVideo.getId());
			rcsBotVideo.setRcsBot(rcsBot);
			// rcsBotService.saveRcsBotRcsBotVideos(rcsBot.getId(), rcsBotVideo);
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotVideoService.deleteRcsBotVideo(rcsBotVideo);
			else {
				rcsBotVideoService.saveRcsBotVideo(rcsBotVideo);
				screenVidesList.add(botVideo.getVideo_name());
			}
		}

		// To copy files from temp to actaul directories- start
		try {
			ArrayList<String> logos = new ArrayList<String>();
			logos.add(rcsBot.getLogoImageName());
			rcsStorageService.copyToActualDirectories(logos, botId, RCSConstant.BOT_LOGO_IMAGE_TYPE, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			rcsStorageService.copyToActualDirectories(screenImagesList, botId, RCSConstant.BOT_SCREEN_IMAGE_TYPE, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			rcsStorageService.copyToActualDirectories(screenVidesList, botId, RCSConstant.BOT_SCREEN_VIDEO_TYPE, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// To copy files from temp to actaul directories- end

		// add country
		ArrayList<BotsCountry> botsCountries = botSettingData.getSupported_country();
		ArrayList<String> countrySupportedList = new ArrayList<String>();
		for (BotsCountry botsCountry : botsCountries) {
			String action = botsCountry.getAction();
			RcsBotAvailable rcsBotAvailable = new RcsBotAvailable();
			rcsBotAvailable.setRcsBot(rcsBot);
			RcsCountryList temp = rcsCountryListService.findRcsCountryListByPrimaryKey(botsCountry.getRcs_country_id());
			countrySupportedList.add(temp.getCountryName());
			rcsBotAvailable.setRcsCountryList(temp);

			if (botsCountry.getId() != null)
				rcsBotAvailable.setId(botsCountry.getId());
			rcsBotAvailable.setRcsBot(rcsBot);
			// rcsBotService.saveRcsBotRcsBotAvailables(rcsBot.getId(), rcsBotAvailable);
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotAvailableService.deleteRcsBotAvailable(rcsBotAvailable);
			else

				rcsBotAvailableService.saveRcsBotAvailable(rcsBotAvailable);
		}
		// add type
		ArrayList<BotType> botTypes = botSettingData.getType();
		for (BotType botType : botTypes) {
			String action = botType.getAction();
			RcsBotType rcsBotType = new RcsBotType();
			rcsBotType.setType(botType.getType());
			rcsBotType.setRcsBotCategoryId(rcsBot.getRcsBotCategory().getId());
			rcsBotType.setRcsBotId(rcsBot.getId());

			if (botType.getId() != null)
				rcsBotType.setId(botType.getId());
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotTypeService.deleteRcsBotType(rcsBotType);

			else

				rcsBotTypeService.saveRcsBotType(rcsBotType);
		}
		// add update
		ArrayList<BotUpdate> botUpdates = botSettingData.getUpdate();
		for (BotUpdate botUpdate : botUpdates) {
			String action = botUpdate.getAction();
			RcsBotUpdateDesc rcsBotUpdateDesc = new RcsBotUpdateDesc();

			rcsBotUpdateDesc.setDescription(botUpdate.getDescription());
			rcsBotUpdateDesc.setRcsBot(rcsBot);
			rcsBotUpdateDesc.setLang(botUpdate.getLang());
			rcsBotUpdateDesc.setStatus(botUpdate.getStatus());

			if (botUpdate.getId() != null)
				rcsBotUpdateDesc.setId(botUpdate.getId());
			if (action != null && action.equals(RCSConstant.FLD_DELETE))
				rcsBotUpdateDescService.deleteRcsBotUpdateDesc(rcsBotUpdateDesc);
			else

				rcsBotUpdateDescService.saveRcsBotUpdateDesc(rcsBotUpdateDesc);

		}
		
		try {
			// add carrier
			ArrayList<BotCarrier> botCarrier = botSettingData.getSupported_carrier();

			for (BotCarrier tempbotCarrier : botCarrier) {
				String action = tempbotCarrier.getAction(); RcsBotCarrierMapping rcsBotCarrierMapping = new
						RcsBotCarrierMapping();

				rcsBotCarrierMapping.setRcsBotId(rcsBot.getId());
				rcsBotCarrierMapping.setRcsBotCarrierId(tempbotCarrier.getRcs_bot_carrier_id(
						)); if (tempbotCarrier.getId() != null)
							rcsBotCarrierMapping.setId(tempbotCarrier.getId());

						tempbotCarrier.setRcs_bot_id(botId);

						logger.info().message(rcsBotCarrierMapping.toString());
						if (action != null && action.equals(RCSConstant.FLD_DELETE))
							rcsBotCarrierMappingService.deleteRcsBotCarrierMapping(rcsBotCarrierMapping);
						else {
							rcsBotCarrierMappingService.saveRcsBotCarrierMapping(rcsBotCarrierMapping);
						}
			}

		} catch (Exception e) {
			logger.error().message("Error in mapping carrier");
			e.printStackTrace();
		}		 

		// add publisher details
		BotPublisherData publisherData = botSettingData.getPublisher_data();
		RcsBotPublisher botPublisher = new RcsBotPublisher();
		botPublisher.setFirstName(publisherData.getFirstName());
		botPublisher.setLastName(publisherData.getLastName());
		botPublisher.setCompanyName(publisherData.getCompanyName());
		botPublisher.setEmail(publisherData.getEmail());
		botPublisher.setPhoneNumber(publisherData.getPhoneNumber());
		botPublisher.setRcsBotId(botId);
		botPublisher.setRcsBotUserId(tempUser.getId());
		botPublisher.setRole(publisherData.getRole());
		rcsBotPublisherService.saveRcsBotPublisher(botPublisher);
		
		// Send email to publisher
		ArrayList<String> emailData = new ArrayList<String>();
		emailData.add(publisherData.getFirstName()+" "+(null != publisherData.getLastName() ? publisherData.getLastName() : "")); // Name
		emailData.add(publisherData.getFirstName()); // First name
		emailData.add(null != publisherData.getLastName() ? publisherData.getLastName() : "");  // Last Name
		emailData.add(null != publisherData.getCompanyName() ? publisherData.getCompanyName() : ""); // Company Name
		emailData.add(null != publisherData.getRole() ? publisherData.getRole() : ""); // Designation
		emailData.add(null != publisherData.getEmail() ? publisherData.getEmail() : ""); // Email
		emailData.add(null != publisherData.getPhoneNumber() ? publisherData.getPhoneNumber() : ""); // Phone number
		
		emailData.add(null != botdesc.get(0).getDisplay_name() ? botdesc.get(0).getDisplay_name() : ""); // Bot display Name
		emailData.add(null != botdesc.get(0).getDescription() ? botdesc.get(0).getDescription() : ""); // Bot description
		
		StringBuffer category = new StringBuffer();
		for(int i = 0; i < categoryList.size(); i++) {
			categoryList.get(i).getRcsBotCategoryDescs().forEach(catge ->{
				category.append(catge.getDisplayName() +" "); // app end categories
			});
			
		}
		emailData.add(category.toString()); // Bot Categories
		
		StringBuffer country = new StringBuffer();
		for(int i =0; i < countrySupportedList.size(); i++) {
			country.append(countrySupportedList.get(i));
		}
		emailData.add(country.toString()); // Bot available Countries
		
		emailData.add(null != botdesc.get(0).getDescription() ? botdesc.get(0).getDescription() : ""); // Bot description
		emailData.add(null != rcsBot.getPlatform() ? rcsBot.getPlatform() : ""); // Platform		
		emailData.add(null != rcsBot.getPrivacyUrl() ? rcsBot.getPrivacyUrl() : ""); // Privacy URL
		emailData.add(null != rcsBot.getTermAndConditionUrl() ? rcsBot.getTermAndConditionUrl() : ""); // Terms URL
		emailData.add(null != rcsBot.getOptInUrl() ? rcsBot.getOptInUrl() : ""); // Optin URL
		emailData.add(null != rcsBot.getRegisterUrl() ? rcsBot.getRegisterUrl() : ""); //Registered URL
		emailData.add("oursupport email"); //Support email
		
		String emailSubject = Common.getSubmitMailSubject(botdesc.get(0).getDisplay_name()); 
		String emailBody = Common.getSubmitMailDetails(emailData);
		mailSenderService.sendSubmitedEmail( publisherData.getEmail(), emailSubject, emailBody);

		return cmdResponse.toJsonData();

	}

	private String getBotList(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer startIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		Integer endIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONArray jSONArray = new JSONArray();

		List<RcsBotDesc> rcsBotDesclist = rcsBotDescService.findAllRcsBotDescs(startIndex, endIndex - startIndex);

		rcsBotDesclist.forEach(rcsbot -> {
			try {
				JSONObject temp = new JSONObject();
				temp.put(RCSConstant.FLD_BOT_ID, rcsbot.getRcsBot().getId());
				temp.put(RCSConstant.FLD_NAME, rcsbot.getBotName());

				temp.put(RCSConstant.FLD_DISPLAY_NAME, rcsbot.getDisplayName());

				temp.put(RCSConstant.FLD_SHORT_DESC, rcsbot.getBotSummary());
				temp.put(RCSConstant.FLD_BOT_ID, rcsbot.getId());
				temp.put(RCSConstant.FLD_LOGO, AppConfig.getRcsBotLogoImageURL(rcsbot.getRcsBot().getId()) + "/"
						+ rcsbot.getRcsBot().getLogoImageName());
				// temp.put(RCSConstant.FLD_LOGO, rcsBotDesc.getRcsBot().getLogoImageName());
				jSONArray.put(temp);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		cmdResponse.addData(RCSConstant.FLD_DATA, jSONArray);
		return cmdResponse.toJsonData();

	}

	private String getBotDetails(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer botId = getRequiredIntField(data, RCSConstant.FLD_BOT_ID);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		RcsBot rcsBot = rcsBotService.findRcsBotByPrimaryKey(botId);

		// set bot details
		BotSettingData botSettingData = new BotSettingData();
		botSettingData.getBot().setBot_id(rcsBot.getId());
		botSettingData.getBot().setRcs_bot_category_id(rcsBot.getRcsBotCategory().getId());
		botSettingData.getBot().setRcs_bot_user_id(rcsBot.getRcsBotUser().getId());
		botSettingData.getBot().setPlatform(rcsBot.getPlatform());
		botSettingData.getBot().setPrivacy_url(rcsBot.getPrivacyUrl());
		botSettingData.getBot().setOpt_in(rcsBot.getOptIn());
		botSettingData.getBot().setOpt_in_url(rcsBot.getOptInUrl());
		botSettingData.getBot().setStatus(rcsBot.getStatus());
		botSettingData.getBot()
				.setLogo_image(AppConfig.getBotLogoImage(rcsBot.getId()) + "/" + rcsBot.getLogoImageName());
		// set bot desc
		ArrayList<BotDesc> tempdesc = botSettingData.getBot_desc();
		Set<RcsBotDesc> botDescList = rcsBot.getRcsBotDescs();
		botDescList.forEach(bot -> {
			BotDesc botDesc = new BotDesc();
			botDesc.setBot_feature(bot.getBotFeature());
			botDesc.setBot_name(bot.getBotName());
			botDesc.setBot_summary(bot.getBotSummary());
			botDesc.setDescription(bot.getDescription());
			botDesc.setLocale(bot.getLang());
			botDesc.setId(bot.getId());
			tempdesc.add(botDesc);
		});
		// set tags
		ArrayList<BotTags> temptags = botSettingData.getTags();
		Set<RcsBotTags> tagList = rcsBot.getRcsBotTagses();
		tagList.forEach(tag -> {
			BotTags temp = new BotTags();
			temp.setId(tag.getId());
			temp.setRcs_bot_category_id(tag.getRcsBotCategory().getId());
			temptags.add(temp);
		});
		// add country
		ArrayList<BotsCountry> tempcountryList = botSettingData.getSupported_country();
		Set<RcsBotAvailable> countryList = rcsBot.getRcsBotAvailables();
		countryList.forEach(country -> {
			BotsCountry botsCountry = new BotsCountry();
			botsCountry.setId(country.getId());
			botsCountry.setRcs_country_id(country.getRcsCountryList().getId());
			tempcountryList.add(botsCountry);
		});
		// add image
		ArrayList<BotImage> tempimage = botSettingData.getScreen_image();
		Set<RcsBotImage> rcsScreenImages = rcsBot.getRcsBotImages();
		rcsScreenImages.forEach(image -> {
			BotImage botImage = new BotImage();
			botImage.setId(image.getId());
			botImage.setDescription(image.getDescription());
			botImage.setImage_name(AppConfig.getRcsBotScreenImageURL(rcsBot.getId()) + "/" + image.getImageName());
			botImage.setStatus(image.getStatus());
			tempimage.add(botImage);

		});
		// add video
		ArrayList<BotVideo> tempvideo = botSettingData.getVideo();
		Set<RcsBotVideo> rcsVideoList = rcsBot.getRcsBotVideos();
		rcsVideoList.forEach(video -> {
			BotVideo botVideo = new BotVideo();
			botVideo.setId(video.getId());
			botVideo.setDescription(video.getDescription());
			botVideo.setVideo_name(AppConfig.getBotScreenVideoURL(rcsBot.getId()) + "/" + video.getVideoName());
			botVideo.setStatus(video.getStatus());
			tempvideo.add(botVideo);
		});

		// add type
		ArrayList<BotType> tempbottype = botSettingData.getType();
		List<RcsBotType> botypelist = rcsBotTypeService.findRcsBotTypeByBotId(rcsBot.getId());
		botypelist.forEach(bottype -> {
			BotType botType = new BotType();
			botType.setId(bottype.getId());
			botType.setRcs_bot_category_id(bottype.getRcsBotCategoryId());
			botType.setRcs_bot_id(bottype.getRcsBotId());
			botType.setType(bottype.getType());
			tempbottype.add(botType);
		});
		// add update
		ArrayList<BotUpdate> tempUpdate = botSettingData.getUpdate();
		Set<RcsBotUpdateDesc> botUpdatList = rcsBot.getRcsBotUpdatesDesc();
		botUpdatList.forEach(bottype -> {
			BotUpdate botUpdate = new BotUpdate();
			botUpdate.setId(bottype.getId());
			botUpdate.setDescription(bottype.getDescription());
			botUpdate.setLang(bottype.getLang());
			botUpdate.setStatus(bottype.getStatus());

			tempUpdate.add(botUpdate);
		});

		// add update
		ArrayList<BotCarrier> tempCarrier = botSettingData.getSupported_carrier();
		Set<RcsBotCarrierMapping> botcarrierlist = rcsBotCarrierMappingService
				.findRcsBotCarrierMappingByRcsBotId(rcsBot.getId());

		botcarrierlist.forEach(bottype -> {
			BotCarrier botCarrier = new BotCarrier();
			botCarrier.setId(bottype.getId());
			botCarrier.setRcs_bot_carrier_id(bottype.getRcsBotCarrierId());

			tempCarrier.add(botCarrier);
		});

		cmdResponse.addData(RCSConstant.FLD_DATA, botSettingData);
		return cmdResponse.toJsonData();
	}

	private String getAllType(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer startIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		Integer endIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONArray jSONArray = new JSONArray();

		List<RcsBotTypeDesc> rcsBotDesclist = rcsBotTypeServiceDesc.findAllRcsBotTypeDescs(startIndex,
				endIndex - startIndex);

		rcsBotDesclist.forEach(rcsbot -> {
			try {
				JSONObject temp = new JSONObject();
				temp.put(RCSConstant.FLD_NAME, rcsbot.getName());
				temp.put(RCSConstant.FLD_ID, rcsbot.getId());

				temp.put(RCSConstant.FLD_DISPLAY_NAME, rcsbot.getDisplayName());

				temp.put(RCSConstant.FLD_LANG, rcsbot.getLang());
				// temp.put(RCSConstant.FLD_LOGO, rcsBotDesc.getRcsBot().getLogoImageName());
				jSONArray.put(temp);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		cmdResponse.addData(RCSConstant.FLD_DATA, jSONArray);
		return cmdResponse.toJsonData();
	}

	private String getAllCateogry(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer startIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		Integer endIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONArray jSONArray = new JSONArray();

		List<RcsBotCategory> rcsBotDesclist = rcsBotCategoryService.findAllRcsBotCategorys(startIndex,
				endIndex - startIndex);

		rcsBotDesclist.forEach(rcsbot -> {
			try {
				JSONObject temp = new JSONObject();
				temp.put(RCSConstant.FLD_ID, rcsbot.getId());
				temp.put(RCSConstant.FLD_NAME, rcsbot.getCategoryName());
				rcsbot.getRcsBotCategoryDescs().forEach(desc->
				{
					try {
						temp.put(RCSConstant.FLD_DISPLAY_NAME, desc.getDisplayName());
					} catch (JSONException e) {
						e.printStackTrace();
					}
					
				});				

				// temp.put(RCSConstant.FLD_LOGO, rcsBotDesc.getRcsBot().getLogoImageName());
				jSONArray.put(temp);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		cmdResponse.addData(RCSConstant.FLD_DATA, jSONArray);
		return cmdResponse.toJsonData();
	}

	private String getAllCountry(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer startIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		Integer endIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONArray jSONArray = new JSONArray();

		List<RcsCountryList> rcsBotDesclist = rcsCountryListService.findAllRcsCountryLists(startIndex,
				endIndex - startIndex);
		Collections.sort(rcsBotDesclist);
		
		rcsBotDesclist.forEach(rcsbot -> {
			try {
				JSONObject temp = new JSONObject();
				temp.put(RCSConstant.FLD_ID, rcsbot.getId());
				temp.put("country_iso_name", rcsbot.getCountryIsoName());

				temp.put("country_name", rcsbot.getCountryName());

				// temp.put(RCSConstant.FLD_LOGO, rcsBotDesc.getRcsBot().getLogoImageName());
				jSONArray.put(temp);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		cmdResponse.addData(RCSConstant.FLD_DATA, jSONArray);
		return cmdResponse.toJsonData();
	}

	private void deleteBot(RcsBot rcsBot) {
		// delete child data.
		Integer botId = rcsBot.getId();
		if (botId != null) {
			// delete logo
			if (rcsBot.getLogoImageName() != null)
				rcsStorageService.deleteFile(rcsBot.getLogoImageName(), botId, RCSConstant.BOT_LOGO_IMAGE_TYPE, false);
			// delete screen image

			Set<RcsBotImage> rcsScreenImages = rcsBot.getRcsBotImages();
			rcsScreenImages.forEach(image -> {
				if (image != null)
					rcsStorageService.deleteFile(image.getImageName(), botId, RCSConstant.BOT_SCREEN_IMAGE_TYPE, false);

			});
			// delete video
			Set<RcsBotVideo> rcsVideoList = rcsBot.getRcsBotVideos();
			rcsVideoList.forEach(video -> {
				if (video != null)
					rcsStorageService.deleteFile(video.getVideoName(), botId, RCSConstant.BOT_SCREEN_VIDEO_TYPE, false);

			});
			rcsBotTagsService.deletebyRcsBotId(botId);
			rcsBotTypeService.deletebyRcsBotId(botId);
			rcsBotUpdateDescService.deletebyRcsBotId(botId);
			rcsBotImageService.deletebyRcsBotId(botId);
			rcsBotVideoService.deletebyRcsBotId(botId);
			rcsBotAvailableService.deletebyRcsBotId(botId);
			rcsBotDescService.deletebyRcsBotId(botId);

			rcsBotService.deleteRcsBot(rcsBot);
		}
	}

	private String getAllCarrierList(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		JSONObject data = getRequiredJSONObjectField(jsonObject, RCSConstant.FLD_DATA);
		Integer startIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		Integer endIndex = getRequiredIntField(data, RCSConstant.FLD_START_INDEX);
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONArray jSONArray = new JSONArray();

		List<RcsBotCarrier> templist = rcsBotCarrierService.findAllRcsBotCarriers(startIndex, endIndex - startIndex);

		Collections.sort(templist);
		
		templist.forEach(rcsbot -> {
			try {
				JSONObject temp = new JSONObject();
				temp.put(RCSConstant.FLD_ID, rcsbot.getId());
				temp.put("carrier_display_name", rcsbot.getDisplayName());
				temp.put("carrier_name", rcsbot.getDisplayName());
				// temp.put(RCSConstant.FLD_LOGO, rcsBotDesc.getRcsBot().getLogoImageName());
				jSONArray.put(temp);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		cmdResponse.addData(RCSConstant.FLD_DATA, jSONArray);
		return cmdResponse.toJsonData();
	}
	
	private String updateBotStatus(JSONObject jsonObject, String jsonData, HttpEntity<String> request) throws CmdHandlerException {
		
		String cmd = getRequiredField(jsonObject, RCSConstant.FLD_CMD);
		String status = getRequiredField(jsonObject, RCSConstant.FLD_STATUS);
		Integer botId = getRequiredIntField(jsonObject, RCSConstant.FLD_BOT_ID);
		RcsBot rcsBot = rcsBotService.findRcsBotByPrimaryKey(botId);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		JSONObject respObj = new JSONObject();
		try {
		if(null != rcsBot) {
			rcsBot.setStatus(status);
			RcsBot updatedBot = rcsBotService.saveRcsBot(rcsBot);
			if(null != updatedBot && "active".equals(updatedBot.getStatus())) {
				cmdResponse.setStatusSuccess();
				respObj.put("upadte_status", "actived");
				respObj.put("bot_id", updatedBot.getId());
			} else {
				cmdResponse.setStatusSuccess();
				respObj.put("upadte_status", "notactivated");
				respObj.put("bot_id", updatedBot.getId());
			}
		} else {
			cmdResponse.setStatusError();
			respObj.put("upadte_status", "error in updating");
			respObj.put("bot_id", botId);
		}
		} catch (JSONException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		cmdResponse.addData(RCSConstant.FLD_DATA, respObj);
		
		return cmdResponse.toJsonData();
	}
}
