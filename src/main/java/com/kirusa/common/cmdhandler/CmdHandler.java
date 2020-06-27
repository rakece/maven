package com.kirusa.common.cmdhandler;

import java.io.FileNotFoundException;

import org.codehaus.jettison.json.JSONObject;

import com.kirusa.exception.RequiredParamerMissing;
import com.kirusa.exception.SkipProcessingException;

public interface CmdHandler {

	public void handle(JSONObject jsonObject, String jsonData)
			throws CmdHandlerException, RequiredParamerMissing,
			SkipProcessingException, FileNotFoundException;
}
