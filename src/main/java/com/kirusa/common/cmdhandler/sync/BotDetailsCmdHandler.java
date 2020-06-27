package com.kirusa.common.cmdhandler.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotImage;
import com.kirusa.domain.RcsBotSnapNumber;
import com.kirusa.domain.RcsBotVideo;
import com.kirusa.image.ImageMgr;
import com.kirusa.request.BotDetailsCmdRequest;
import com.kirusa.request.BotReqData;
import com.kirusa.request.BotRequired;
import com.kirusa.response.BotContent;
import com.kirusa.response.BotDataDetails;
import com.kirusa.response.BotDescription;
import com.kirusa.response.BotDetailsCmdResponse;
import com.kirusa.response.BotImage;
import com.kirusa.response.BotInfo;
import com.kirusa.response.BotMultimedia;
import com.kirusa.response.BotVideo;
import com.kirusa.service.RcsBotCarrierMappingService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotSnapNumberService;
import com.kirusa.service.RcsBotUpdateDescService;
import com.kirusa.util.AppConfig;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;

@Component
public class BotDetailsCmdHandler extends AbstractCmdHandlerSync {

	@Autowired
	private RcsBotService rcsBotService;

	@Autowired
	private RcsBotUpdateDescService botUpdateDescService;

	@Autowired
	private RcsBotSnapNumberService botSnapNumberService; 
	
	@Autowired
	RcsBotCarrierMappingService rcsBotCarrierMappingService;
	
	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		BotDetailsCmdRequest botDetailReq = new Gson().fromJson(jsonData, BotDetailsCmdRequest.class);

		BotReqData reqData = botDetailReq.getReqData();

		BotRequired botRequired = reqData.getBotRequired();
		Integer botId = botRequired.getBotId();
		String botName = botRequired.getBotName();

		String iso = reqData.getCountryIso();
		String locale = reqData.getLocale();

		RcsBot rcsBot = rcsBotService.findRcsBotByPrimaryKey(botId);

		BotDetailsCmdResponse response = new BotDetailsCmdResponse();
		if(null != botDetailReq.getMsisdn())
			response.setMsisdn(botDetailReq.getMsisdn());
			

		if (null != rcsBot) {
			response.setCmd(Cmd.CMD_BOT_DETAILS);
			response.setStatus("ok");

			BotDataDetails data = new BotDataDetails();
			BotContent botContent = new BotContent();
			BotInfo botInfo = new BotInfo();
			BotMultimedia botMultiMedia = new BotMultimedia();
			BotVideo botVideo = new BotVideo();
			ArrayList<BotImage> botImages = new ArrayList<BotImage>();

			// Bot Desc
			Set<RcsBotDesc> descs = rcsBot.getRcsBotDescs();
			RcsBotDesc botDesc = descs.stream().filter(botdesc -> botdesc.getLang().contains(locale)).findAny().orElse(
					descs.stream().filter(botdesc2 -> botdesc2.getLang().contains("en_US")).findAny().orElse(null));

			// Tags list
			Set<RcsBotCategoryDesc> categoryDescs = rcsBot.getRcsBotCategory().getRcsBotCategoryDescs();
			ArrayList<String> tagsList = new ArrayList<String>();
			categoryDescs.forEach(botCat -> {
				tagsList.add(botCat.getDisplayName());
			});

			// Country Available
			boolean isAvailable = false;
			Set<RcsBotAvailable> botAvailables = rcsBot.getRcsBotAvailables();
			ArrayList<String> botCountryList = new ArrayList<String>();
			for (RcsBotAvailable botAvailable : botAvailables) {
				botCountryList.add(botAvailable.getRcsCountryList().getCountryName());
				if (botAvailable.getRcsCountryList().getCountryIsoName().equalsIgnoreCase(iso)) {
					isAvailable = true;
				}
			}

			// Snap call number's for bot
			ArrayList<String> snapNumbersList = new ArrayList<String>();
			for (RcsBotSnapNumber snapNumber : botSnapNumberService.findRcsBotSnapNumberByRcsBotId(rcsBot.getId())) {
				snapNumbersList.add(Common.formatPhoneNumber(snapNumber.getSnapCallNumber(), snapNumber.getSnapCountryIso()));
			}
						
			//Carrier List
			List<RcsBotCarrier> templist =rcsBotCarrierMappingService.findRcsBotCarrierByBotId(botId,0,20);
			ArrayList<String> carrierList = new ArrayList<String>();
			templist.forEach(carrier ->{
				carrierList.add(carrier.getDisplayName());
			});
			botInfo.setCarrierList(carrierList);

			// bot rating
			int rateCount = 0;
			float ratingCount = 0;
			for (RcsBotComment rcsBotComment : rcsBot.getRcsBotComments()) {
				int rating = rcsBotComment.getRating();
				if (rating > 0) {
					rateCount = rateCount + 1;
					ratingCount = ratingCount + rating;
				}
			}
			float currentRating = 0;
			if (rateCount > 0)
				currentRating = Common.getRoundOfValue(ratingCount / rateCount);

			botInfo.setBotId(rcsBot.getId());
			botInfo.setBotName(botDesc.getBotName());
			botInfo.setBotDisplayName(botDesc.getDisplayName());
			botInfo.setBotCountryAvailable(isAvailable);
			botInfo.setBotImage(AppConfig.getRcsBotLogoImageURL(rcsBot.getId()) + "/" + rcsBot.getLogoImageName());
			botInfo.setBotShortDesc(botDesc.getBotSummary());
			botInfo.setBotRatingCount(ratingCount);
			botInfo.setTagsList(tagsList);
			botInfo.setBotCountriesList(botCountryList);
			botInfo.setSnapNumbersList(snapNumbersList);
			botContent.setBotInfo(botInfo); // Added bot info to bot content

			// Bot Video
			for (RcsBotVideo rcsBotVideo : rcsBot.getRcsBotVideos()) {
				botVideo.setVideoId(rcsBotVideo.getId());
				botVideo.setVideoName(rcsBotVideo.getVideoName());
				botVideo.setVideoUrl(AppConfig.getBotScreenVideoURL(rcsBot.getId()) + "/" + rcsBotVideo.getVideoName());
				botVideo.setVideoMimeType(ImageMgr.getFileNameExt(rcsBotVideo.getVideoName(),
						rcsBotVideo.getVideoName().lastIndexOf(".")));
			}
			botMultiMedia.setVideo(botVideo); // set bot video

			// Bot Images
			for (RcsBotImage rcsBotImg : rcsBot.getRcsBotImages()) {
				BotImage botImg = new BotImage();
				botImg.setImageId(rcsBotImg.getId());
				botImg.setImgName(rcsBotImg.getImageName());
				botImg.setImgMimeType(
						ImageMgr.getFileNameExt(rcsBotImg.getImageName(), rcsBotImg.getImageName().lastIndexOf(".")));
				botImg.setImgUrl(AppConfig.getRcsBotScreenImageURL(rcsBot.getId()) + "/" + rcsBotImg.getImageName());
				botImages.add(botImg);
			}
			botMultiMedia.setImages(botImages); // set bot images

			botContent.setBotMultimedia(botMultiMedia); // set bot multi-media
			
			// Description
			BotDescription upDateDesc = botUpdateDescService.findMostRecentUpdateByRcsBotId(botId, locale);
			upDateDesc.setBotDescription(botDesc.getDescription());

			botContent.setBotDescription(upDateDesc); // set bot description with update

			botContent.setBotCurentRating(currentRating);
			botContent.setBotMaxRating(Float.parseFloat(RCSConstant.FLD_MAX_RATING));
			botContent.setOpitUrl(rcsBot.getOptInUrl());
			botContent.setBotOptIn("true".equalsIgnoreCase(rcsBot.getOptIn()) ? true : false);
			data.setBotContent(botContent);
			response.setBotDataDetails(data);

		} else {

			response.setStatus("error");
			response.setError_desc("Rcs Bot Data not available");
		}

		return new Gson().toJson(response).toString();
	}

}
