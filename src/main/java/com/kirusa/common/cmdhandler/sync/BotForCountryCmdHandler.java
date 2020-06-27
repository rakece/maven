package com.kirusa.common.cmdhandler.sync;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.response.BotListResponse;
import com.kirusa.response.BotSummary;
import com.kirusa.service.RcsBotAvailableService;
import com.kirusa.service.RcsBotCategoryDescService;
import com.kirusa.service.RcsBotService;
import com.kirusa.util.AppConfig;
import com.kirusa.util.RCSConstant;


@Component
public class BotForCountryCmdHandler extends AbstractCmdHandlerSync {

	@Autowired
	RcsBotAvailableService rcsBotAvailableService;

	@Autowired
	RcsBotService rcsBotService;

	@Autowired
	RcsBotCategoryDescService rcsBotCategoryDescService;

	private static DecimalFormat df2 = new DecimalFormat("#.#");

	private Gson gson = new Gson();


	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		BotForCountryRequest botsForCountryReq = new Gson().fromJson(jsonData , BotForCountryRequest.class);
		BotForCountryData reqData = botsForCountryReq.getData();
		Integer countryId = reqData.getCountry_id();

		BotListResponse botListResponse = new BotListResponse();
		botListResponse.setCmd(botsForCountryReq.getCmd());

		if(null != botsForCountryReq.getMsisdn())
			botListResponse.setMsisdn(botsForCountryReq.getMsisdn());

		// Get country-bots mapping
		List<Integer>  rcsbotavailable = rcsBotAvailableService.findRcsBotAvailableByRcsBotCountryId(countryId);
		if(rcsbotavailable == null || rcsbotavailable.size() == 0) {
			botListResponse.setStatus(RCSConstant.FLD_ERROR);
			botListResponse.setError_desc("No bots found for the selected country");
			return gson.toJson(botListResponse);
		}


		ArrayList<BotSummary> botSummaryList = new ArrayList<BotSummary>();
		for(Integer rcsBotId : rcsbotavailable) {
			RcsBot bot = rcsBotService.findRcsBotByPrimaryKey(rcsBotId); // TODO: Modify to get all the bots in one shot
			if(null != bot) {
				BotSummary botSummary = getBotSummary(bot, reqData.getLocale(), -1, -1);
				if(null != botSummary)
					botSummaryList.add(botSummary);
			}
		}

		botListResponse.setStatus(RCSConstant.FLD_SUCCESS);
		botListResponse.getData().setBotList(botSummaryList);
		return gson.toJson(botListResponse);
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
