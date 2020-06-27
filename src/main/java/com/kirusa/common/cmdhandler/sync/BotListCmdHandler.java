package com.kirusa.common.cmdhandler.sync;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.domain.RcsBotType;
import com.kirusa.domain.RcsBotTypeDesc;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;
import com.kirusa.request.BotListRequest;
import com.kirusa.response.BotByTypes;
import com.kirusa.response.BotListResponse;
import com.kirusa.response.BotSummary;
import com.kirusa.response.CmdResponse;
import com.kirusa.service.RcsBotCategoryDescService;
import com.kirusa.service.RcsBotCategoryService;
import com.kirusa.service.RcsBotDescService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotTypeDescService;
import com.kirusa.service.RcsBotTypeService;
import com.kirusa.util.AppConfig;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;

@Component
public class BotListCmdHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(BotListCmdHandler.class);

	private static DecimalFormat df2 = new DecimalFormat("#.#");

	@Autowired
	ApplicationContext context;

	@Autowired
	private RcsBotTypeService rcsBotTypeService;

	@Autowired
	private RcsBotService rcsBotService;

	@Autowired
	private RcsBotCategoryService rcsBotCategoryService;

	@Autowired
	private RcsBotCategoryDescService rcsBotCategoryDescService;

	@Autowired
	private RcsBotTypeDescService rcsBotTypeDescService;

	@Autowired
	private RcsBotDescService rcsBotDescService;

	private static Gson gson = new Gson();

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		// TODO Auto-generated method stub
		// check rcsbot type.

		Boolean categoryFlag = false;
		BotListRequest botlistReq = gson.fromJson(jsonData, BotListRequest.class);
		BotListResponse botListResponse = new BotListResponse();
		int startIndex = Integer.parseInt(botlistReq.getData().getStartIndex());
		int endIndex = Integer.parseInt(botlistReq.getData().getEndIndex());

		if (!botlistReq.getCmd().equals(RCSConstant.CMD_BOT_LIST)) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_UNSUPPORTED_CMD,
					String.format(CmdHandlerException.ERRMSG_UNSUPPORTED_CMD, botlistReq.getCmd()));

		}
		botListResponse.setCmd(botlistReq.getCmd());
		String locale = botlistReq.getData().getLocale();
		if (locale == null) {
			locale = "en_US";
		}
		// get bot by type.
		if (botlistReq.getData().getFilter() != null && botlistReq.getData().getFilter().getType() != null) {
			
			ArrayList<String> bottypes = botlistReq.getData().getFilter().getType();
			
			for (String bottype : bottypes) {
				BotByTypes temp = this.getBotByType(bottype, startIndex, endIndex, locale);
				botListResponse.getData().getBotByYypes().add(temp);
			}
		}
		// get bot based on category
		if (botlistReq.getData().getFilter() != null && botlistReq.getData().getFilter().getCategory() != null) {
			if (botlistReq.getData().getFilter().getCategory() != null) {

				ArrayList<String> botCategoryList = botlistReq.getData().getFilter().getCategory();

				categoryFlag = true;
				for (String botCategory : botCategoryList) {

					List<RcsBotCategory> rcsBotCategory = rcsBotCategoryService
							.findRcsBotCategoryByCategoryName(botCategory, startIndex, endIndex - startIndex);
					if (rcsBotCategory.size() > 0) {
						Set<RcsBot> rcsBotList = rcsBotService.findRcsBotByRcsBotCategoryId(
								rcsBotCategory.get(0).getId(), startIndex, endIndex - startIndex);

						for (RcsBot rcsBot : rcsBotList) {
							if("active".equals(rcsBot.getStatus())) {
								BotSummary botSummary = getBotSummary(rcsBot, locale, startIndex, endIndex);
								if(botSummary!=null)
									botListResponse.getData().getBotList().add(botSummary);
							}

						}
					}
				}
			}

		}
		// if not category specified
		if (!categoryFlag && (botlistReq.getData().getFilter() == null)) {
			List<RcsBot> rcsBotList = rcsBotService.findAllRcsBots(startIndex, endIndex - startIndex);
			for (RcsBot rcsBot : rcsBotList) {
				if("active".equals(rcsBot.getStatus())) {
					BotSummary botSummary = getBotSummary(rcsBot, locale, startIndex, endIndex);
					botListResponse.getData().getBotList().add(botSummary);
				}

			}

		}
		// if search key is present and not empty
		if (botlistReq.getData().getFilter() != null && botlistReq.getData().getFilter().getSearchKey() != null) {
			String key = botlistReq.getData().getFilter().getSearchKey();
			if (key.length() > 0) {
				// Set<RcsBotDesc> rcsBotDescList =
				// rcsBotDescService.findRcsBotDescByLangAndSummary(locale,"%"+key+"%",startIndex,
				// endIndex - startIndex);
				// for (RcsBotDesc rcsBotDesc : rcsBotDescList) {
				// BotSummary botSummary = getBotSummary(rcsBotDesc.getRcsBot(), locale,
				// startIndex, endIndex);
				// botListResponse.getData().getBotList().add(botSummary);

				// }
				CmdResponse cmdResponse = new CmdResponse();
				cmdResponse.addData(Cmd.FLD_CMD, "bot_search");
				if(null != botlistReq.getMsisdn())
					cmdResponse.addData(RCSConstant.FLD_MSISDN_NUM, botlistReq.getMsisdn());
				
				cmdResponse.addData(RCSConstant.FLD_STATUS, RCSConstant.FLD_STATUS_OK);
				JSONArray ret = context.getBean(SearchRcsBotHandler.class).getautocompleteBotList(key, locale);
				cmdResponse.addData(RCSConstant.FLD_DATA, ret);
				return cmdResponse.toJsonData();

			}

		}
		botListResponse.setStatus(RCSConstant.FLD_STATUS_OK);
		if( null != botlistReq.getMsisdn())
			botListResponse.setMsisdn(botlistReq.getMsisdn());
		String json = gson.toJson(botListResponse);
		logger.info().field(LogConstants.METHOD, "handle").field(LogConstants.CMD_DATA, Common.json2Map(json)).logOpr();
		return json;
	}

	private BotByTypes getBotByType(String botype, int startIndex, int endIndex, final String locale) {
		// get bot list based on type.
		BotByTypes botByTypes = new BotByTypes();
		List<RcsBotTypeDesc> rcsBotTypeDesc = rcsBotTypeDescService.findRcsBotTypeDescByNameAndLang(botype, locale,
				startIndex, endIndex - startIndex);
		if (rcsBotTypeDesc.size() > 0) {
			botByTypes.setType(rcsBotTypeDesc.get(0).getDisplayName());
		} else
			botByTypes.setType(botype);

		List<RcsBotType> rcsBotType = rcsBotTypeService.findRcsBotByTypes(botype, startIndex, endIndex - startIndex);
		ArrayList<BotSummary> preferedBots = new ArrayList<BotSummary>();
		rcsBotType.forEach(bottype -> {
			RcsBot rc = rcsBotService.findRcsBotByPrimaryKey(bottype.getRcsBotId());
			if("active".equals(rc.getStatus())) {
				BotSummary botSummary = getBotSummary(rc, locale, startIndex, endIndex);
				String botName = botSummary.getName().toLowerCase();
				if(botName.contains("instavoice") || botName.contains("orange") || botName.contains("my9mobile") || botName.contains("welcome")) {
					preferedBots.add(botSummary);
				} else {
					botByTypes.getBotList().add(botSummary);
				}
			}
		});
		
		Collections.shuffle(preferedBots, new Random());
		botByTypes.getBotList().addAll(0, preferedBots);
		
		return botByTypes;
	}

	private BotSummary getBotSummary(RcsBot rcsBot, final String locale, int startIndex, int endIndex) {
		Double totalRating = 0.0;
		Integer ratingCount = 0;
		RcsBotDesc tempDesc = null;
		BotSummary botSummary=null;
		for (RcsBotDesc rcsBotDesc : rcsBot.getRcsBotDescs()) {
			if (rcsBotDesc.getLang().equals(locale))
				tempDesc = rcsBotDesc;
		}
		if (tempDesc != null) {
			
			botSummary = new BotSummary();
			ArrayList<String> tags = new ArrayList<String>();
			botSummary.setBotId(rcsBot.getId());
			botSummary.setLogo(AppConfig.getRcsBotLogoImageURL(rcsBot.getId()) + "/" + rcsBot.getLogoImageName());
			botSummary.setDispalyName(tempDesc.getDisplayName());
			botSummary.setName(tempDesc.getBotName());
			botSummary.setShortDesc(tempDesc.getBotSummary());
			botSummary.setFeature(tempDesc.getBotFeature());
			for (RcsBotTags rcsBottags : rcsBot.getRcsBotTagses()) {
				List<RcsBotCategoryDesc> rcsBotCategoryDescList = rcsBotCategoryDescService
						.findRcsBotCategoryDescByLangAndById(rcsBottags.getRcsBotCategory().getId(), locale, startIndex,
								endIndex - startIndex);
				if (rcsBotCategoryDescList.size() > 0) {
					tags.add(rcsBotCategoryDescList.get(0).getDisplayName());
				} else {
					tags.add(rcsBottags.getRcsBotCategory().getCategoryName());
				}

			}
			for (RcsBotComment rcsBotComment : rcsBot.getRcsBotComments()) {
				ratingCount++;
				totalRating = totalRating + rcsBotComment.getRating();
			}
			if (ratingCount > 0)

				botSummary.setRating(df2.format(totalRating / ratingCount));

			else
				botSummary.setRating(df2.format(totalRating));

			botSummary.setMaxRating(RCSConstant.FLD_MAX_RATING);
			botSummary.setTags(tags);
		}
		return botSummary;
	}
}
