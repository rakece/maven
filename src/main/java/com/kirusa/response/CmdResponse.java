package com.kirusa.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;

public class CmdResponse {

	protected static final transient IvLogger logger = LoggerFactory.getLogger(CmdResponse.class);

	private static Gson gson = new Gson();
	private static final String FLD_CMD_TAG = "tag";

	protected LinkedHashMap<String, Object> data = new LinkedHashMap<String, Object>();

	public CmdResponse() {
		this(null);
	}

	/**
	 * @param jsonObject
	 */
	public CmdResponse(JSONObject jsonObject) {
		if (jsonObject != null) {
			this.addData(RCSConstant.FLD_CMD,
					Common.getString(jsonObject, RCSConstant.FLD_CMD));
			this.addData(FLD_CMD_TAG,
					Common.getStringAsNull(jsonObject, FLD_CMD_TAG));
		}
		setStatusSuccess();
	}

	public void setStatusSuccess() {
		data.put(RCSConstant.FLD_STATUS, "ok");
	}

	public void setStatusError(String reason) {
		data.put(RCSConstant.FLD_STATUS, "error");
		data.put(RCSConstant.FLD_ERROR_REASON, reason);
	}

	public void setStatusError() {
		data.put(RCSConstant.FLD_STATUS, "Error");
	}

	public void setStatusError(Exception e) {
		int errCode;
		String reason;
		if (e instanceof CmdHandlerException) {
			errCode = ((CmdHandlerException) e).errCode;
		} else {
			errCode = CmdHandlerException.ERRCODE_SYSTEM;
		}
		reason = e.getMessage();
		if (reason == null) {
			reason = CmdHandlerException.ERRMSG_SYSTEM;
		}
		data.put(RCSConstant.FLD_STATUS, "error");
		data.put(RCSConstant.FLD_ERROR_CODE, errCode);
		data.put(RCSConstant.FLD_ERROR_REASON, reason);
		// As per API document, response should contain, error_code.
		data.put("error_code", errCode);
	}

	public void addData(String key, Object value) {
		data.put(key, value);
	}

	public void addData(String key, JSONObject value) {
		Map<String, Object> resMap = null;
		try {
			resMap = Common.toMap(value);
		} catch (JSONException e) {
			logger.error()
				.field(LogConstants.METHOD, "addData")
				.exception(LogConstants.EXCEPTION, e).log();
		}
		if (!resMap.isEmpty())
			data.put(key, resMap);
	}
	
	public void addData(String key, JSONArray value) {
		JSONObject obj = new JSONObject();
		List<HashMap<String, Object>> arrayList = new ArrayList<HashMap<String, Object>>();
		try {
			for (int i = 0; i < value.length(); i++) {
				obj = (JSONObject) value.get(i);
				HashMap<String, Object> resMap = Common.toHashMap(obj);
				arrayList.add(resMap);
			}
		} catch (JSONException e) {
			logger.error()
				.exception(LogConstants.EXCEPTION, e)
				.message("value[" + value + "]").log();
		}
		data.put(key, arrayList);
	}

	public void removeData(String key) {
		data.remove(key);
	}

	public Object getData(String key) {
		return (data.get(key));
	}

	public String toJsonData() {
		return gson.toJson(this.data);
	}
}