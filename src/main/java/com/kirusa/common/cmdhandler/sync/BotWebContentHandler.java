package com.kirusa.common.cmdhandler.sync;

import java.text.DecimalFormat;
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
import com.kirusa.common.cmdhandler.CmdHandlerMgr;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTypeDesc;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;
import com.kirusa.request.BotListRequest;
import com.kirusa.response.BotByTypes;
import com.kirusa.response.BotListResponse;
import com.kirusa.response.BotSummary;
import com.kirusa.response.BotWebContent;
import com.kirusa.response.BotWebContentResponse;
import com.kirusa.service.RcsBotCategoryDescService;
import com.kirusa.service.RcsBotCategoryService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotTypeDescService;
import com.kirusa.service.RcsBotTypeService;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;

@Component
public class BotWebContentHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(CmdHandlerMgr.class);

	private static DecimalFormat df2 = new DecimalFormat("#.#");

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

	private static Gson gson = new Gson();

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		// TODO Auto-generated method stub
		// check rcsbot type.
		List<BotWebContent> botTypeWebContent= new ArrayList<BotWebContent>();
		String cmd = getRequiredField(jsonObject, Cmd.FLD_CMD);
		String locale = getRequiredField(jsonObject, RCSConstant.FLD_LOCALE);
		BotWebContentResponse botWebContentResponse = new BotWebContentResponse();
		botWebContentResponse.setCmd(cmd);
		botWebContentResponse.setStatus(RCSConstant.FLD_STATUS_OK);
		if (locale == null)
			locale = RCSConstant.FLD_DEFAULT_LOCALE;
		List<BotWebContent> botWebContent = rcsBotCategoryService.findRcsCategory(locale);
		botWebContentResponse.getData().setBotCategory(botWebContent);

		Set<RcsBotTypeDesc> rcsBotTypeList = rcsBotTypeDescService.findRcsBotTypeDescByLang(locale);

		rcsBotTypeList.forEach(bottype -> {
			BotWebContent temp = new BotWebContent(bottype.getId(),bottype.getName(),bottype.getDisplayName());
			botTypeWebContent.add(temp);
		});
		botWebContentResponse.getData().setBotType(botTypeWebContent);
		String json = gson.toJson(botWebContentResponse);
		logger.info().field(LogConstants.METHOD, "handle").field(LogConstants.CMD_DATA, Common.json2Map(json)).logOpr();
		return json;
	}
}
