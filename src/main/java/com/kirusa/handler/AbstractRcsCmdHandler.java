package com.kirusa.handler;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;

abstract public  class AbstractRcsCmdHandler {

	protected static final IvLogger logger = LoggerFactory.getLogger(AbstractRcsCmdHandler.class);

	protected static String getRequiredField(JSONObject jsonObject, String key) throws CmdHandlerException {

		try {
			return jsonObject.getString(key);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getRequiredField").exception(LogConstants.EXCEPTION, e)
					.message("missing field [" + key + "] from cmd [" + jsonObject.toString() + "]").logOpr();

			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
	}

	protected static JSONObject getRequiredJSONObjectField(JSONObject jsonObject, String key)
			throws CmdHandlerException {

		JSONObject rJsonObject = null;
		try {
			rJsonObject = jsonObject.getJSONObject(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
		return rJsonObject;
	}

	protected static JSONArray getRequiredJSONArrayField(JSONObject jsonObject, String key) throws CmdHandlerException {

		JSONArray jsonArray = null;
		try {
			jsonArray = jsonObject.getJSONArray(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
		return jsonArray;
	}
	protected static String getRequiredField(JSONObject jsonObject, String key, String alternateKey)
			throws CmdHandlerException {

		try {
			return jsonObject.getString(key);
		} catch (Exception e1) {
			logger.info().field(LogConstants.METHOD, "getRequiredField(alternateKey)").message(
					"Primary required field [" + key + "] not found, trying alternative field [" + alternateKey + "]")
					.logOpr();
			try {
				return jsonObject.getString(alternateKey);
			} catch (Exception e2) {
				throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING, String.format(
						CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key + " and alternate key " + alternateKey));
			}
		}
	}

	protected static Integer getRequiredIntField(JSONObject jsonObject, String key) throws CmdHandlerException {

		try {
			return jsonObject.getInt(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
	}

	protected static Long getRequiredLongField(JSONObject jsonObject, String key) throws CmdHandlerException {

		try {
			return jsonObject.getLong(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
	}

	protected static Boolean getRequiredBoolField(JSONObject jsonObject, String key) throws CmdHandlerException {

		try {
			return jsonObject.getBoolean(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
	}

	protected static JSONArray getRequiredJsonArrayField(JSONObject jsonObject, String key) throws CmdHandlerException {

		try {
			return jsonObject.getJSONArray(key);
		} catch (Exception e) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_REQUIRED_FIELD_MISSING,
					String.format(CmdHandlerException.ERRMSG_REQUIRED_FIELD_MISSING, key));
		}
	}
	
	private void writeResponse(HttpServletResponse response, String responseStr)
			throws Exception {
		PrintWriter out = null;
		try {
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			// out.write(new String(responseStr.getBytes(IVConstants.UTF_8),
			// IVConstants.UTF_8));
			out.write(responseStr);
		} catch (Exception e) {
			logger.error()
				.exception(LogConstants.EXCEPTION, e)
				.log();
			throw e;
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}
}

