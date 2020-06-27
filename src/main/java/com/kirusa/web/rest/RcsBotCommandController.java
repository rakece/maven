package com.kirusa.web.rest;

import java.io.FileNotFoundException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.engine.spi.EffectiveEntityGraph;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.common.cmdhandler.CmdHandlerMgr;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.exception.RequiredParamerMissing;
import com.kirusa.exception.SkipProcessingException;
import com.kirusa.response.CmdResponse;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;

@Controller("RcsBotCommandController")
public class RcsBotCommandController {

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/rcsbotdirectory/bots", method = RequestMethod.POST)
	@ResponseBody
	public String botDirectoryRequest(HttpEntity<String> httpEntity) {
		
		String response=null,cmd=null;
		try {
			response=CmdHandlerMgr.handleCmd(httpEntity);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response=setError(httpEntity,null,e.getMessage());
		} catch (CmdHandlerException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			response=setError(httpEntity,e.errCode,e.getMessage());
		} catch (RequiredParamerMissing e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response=setError(httpEntity,e.errCode,e.getMessage());
		} catch (SkipProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response=setError(httpEntity,null,e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response=setError(httpEntity,null,e.getMessage());
		}
		return response;
		
	}
	private String setError(HttpEntity<String> httpEntity, Integer errorCode,String errorMessage)
	{
		String jsonData = httpEntity.getBody();
		JSONObject jsonObject;
		String cmd=null;
		try {
			jsonObject = Common.toJSONObject(jsonData);
			cmd = jsonObject.getString(Cmd.FLD_CMD);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		cmdResponse.addData(RCSConstant.FLD_STATUS, RCSConstant.FLD_ERROR);
		cmdResponse.addData(RCSConstant.FLD_ERROR_CODE, errorCode);
		cmdResponse.addData(RCSConstant.FLD_ERROR_REASON, errorMessage);
		return cmdResponse.toJsonData();
		
	}
}