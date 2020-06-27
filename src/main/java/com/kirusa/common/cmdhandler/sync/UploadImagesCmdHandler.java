package com.kirusa.common.cmdhandler.sync;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.kirusa.common.cmdhandler.CmdHandlerException;

@Component
public class UploadImagesCmdHandler extends AbstractCmdHandlerSync {

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		return null;
	}

}
