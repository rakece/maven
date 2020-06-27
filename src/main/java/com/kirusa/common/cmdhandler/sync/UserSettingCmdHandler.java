package com.kirusa.common.cmdhandler.sync;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsCountryList;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.request.BotListRequest;
import com.kirusa.response.CmdResponse;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotUserService;
import com.kirusa.service.RcsCountryListService;
import com.kirusa.util.RCSConstant;

@Component
public class UserSettingCmdHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(UserSettingCmdHandler.class);

	@Autowired
	private RcsBotUserService rcsBotUserService;
	
	@Autowired
	private RcsCountryListService rcsCountryListService;
	
	
	
	private static Gson gson = new Gson();
	
	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		
		String cmd = getRequiredField(jsonObject, Cmd.FLD_CMD);
		String action = getRequiredField(jsonObject, Cmd.FLD_ACTION);
		String locale = getRequiredField(jsonObject, RCSConstant.FLD_LOCALE);
		String data = getRequiredField(jsonObject,RCSConstant.FLD_DATA );
		
		JSONObject rcsCountryJson = getRequiredJSONObjectField(jsonObject,RCSConstant.FLD_DATA );
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		RcsBotUser rcsBotUser=null;
		
		if (locale == null)
			locale = RCSConstant.FLD_DEFAULT_LOCALE;
		
		if(action.equals(Cmd.FLD_CREATE_USER))
		{
			rcsBotUser = gson.fromJson(data, RcsBotUser.class);
			rcsBotUser.setLang(locale);
			String rcsCountryId = getRequiredField(rcsCountryJson,"rcs_country_id" );
			RcsCountryList rcsCountryList=rcsCountryListService.findRcsCountryListByPrimaryKey(Integer.parseInt(rcsCountryId));
			rcsBotUser.setRcsCountryList(rcsCountryList);
			rcsBotUser=rcsBotUserService.saveRcsBotUser(rcsBotUser);
		}
		
		
		
		cmdResponse.addData(RCSConstant.FLD_STATUS, RCSConstant.FLD_STATUS_OK);
		JSONObject resJson = new JSONObject();
		try {
			resJson.put("id", rcsBotUser.getId());
			resJson.put("name", rcsBotUser.getFname());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmdResponse.addData("data", resJson);
		return cmdResponse.toJsonData();
		
		
	}

}
