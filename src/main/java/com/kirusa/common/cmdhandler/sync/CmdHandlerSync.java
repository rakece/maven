package com.kirusa.common.cmdhandler.sync;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.HttpEntity;

import com.kirusa.common.cmdhandler.CmdHandlerException;

public interface CmdHandlerSync {

	
	public String handle(JSONObject jsonObject, String jsonData,HttpEntity<String> request) throws CmdHandlerException;
	}
