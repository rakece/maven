package com.kirusa.common.cmdhandler;

import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.kirusa.common.cmdhandler.sync.BotDetailsCmdHandler;
import com.kirusa.common.cmdhandler.sync.BotForCarrierCmdHandler;
import com.kirusa.common.cmdhandler.sync.BotForCountryCmdHandler;
import com.kirusa.common.cmdhandler.sync.BotListCmdHandler;
import com.kirusa.common.cmdhandler.sync.CmdHandlerSync;
import com.kirusa.common.cmdhandler.sync.SearchAutoCompleteHandler;
import com.kirusa.exception.RequiredParamerMissing;
import com.kirusa.exception.SkipProcessingException;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;
import com.kirusa.util.Common;
import com.kirusa.common.cmdhandler.sync.BotWebContentHandler;
import com.kirusa.common.cmdhandler.sync.SearchRcsBotHandler;
import com.kirusa.common.cmdhandler.sync.UploadImagesCmdHandler;
import com.kirusa.common.cmdhandler.sync.UserSettingCmdHandler;
import com.kirusa.common.cmdhandler.sync.BotOperationCmdHandler;
import com.kirusa.common.cmdhandler.sync.BotBillingCmdHandler;



@Component
public class CmdHandlerMgr {

	private static final IvLogger logger = LoggerFactory.getLogger(CmdHandlerMgr.class);
	private static HashMap<String, CmdHandlerSync> cmdHandlers;

	@Autowired
	ApplicationContext context;

	@PostConstruct
	public void init() {

		cmdHandlers = new HashMap<String, CmdHandlerSync>();
		cmdHandlers.put(Cmd.CMD_BOT_LIST, context.getBean(BotListCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_DETAILS, context.getBean(BotDetailsCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_WEB_CONTENT, context.getBean(BotWebContentHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_SEARCH, context.getBean(SearchRcsBotHandler.class));
		cmdHandlers.put(Cmd.CMD_UPLOAD_IMG, context.getBean(UploadImagesCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_USER_SETTING, context.getBean(UserSettingCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_SETTING, context.getBean(BotOperationCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_BILLING_SETTING, context.getBean(BotBillingCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOT_SEARCH_AUTOCOMPLETE, context.getBean(SearchAutoCompleteHandler.class));
		cmdHandlers.put(Cmd.CMD_BOTS_FOR_CARRIER, context.getBean(BotForCarrierCmdHandler.class));
		cmdHandlers.put(Cmd.CMD_BOTS_FOR_COUNTRY, context.getBean(BotForCountryCmdHandler.class));
		
		
		
		}

	public static String handleCmd(HttpEntity<String> request)
			throws CmdHandlerException, FileNotFoundException, RequiredParamerMissing, SkipProcessingException {

		String cmd = null;
		JSONObject jsonObject = null;
		CmdHandlerSync handler = null;
		String jsonData = null;
		long startTime = System.currentTimeMillis();
		String responseStr = null;

		try {

			jsonData = request.getBody();

			// getParameter(RCSConstant.FLD_DATA);
			jsonObject = Common.toJSONObject(jsonData);

			logger.debug().message("process() jsonObject[" + jsonObject + "]").log();

			cmd = jsonObject.getString(Cmd.FLD_CMD);

			handler = cmdHandlers.get(cmd);

			responseStr = handler.handle(jsonObject, jsonData, request);

		} catch (JSONException je) {
			logger.error().field(LogConstants.METHOD, "handleCmd")
					.field(LogConstants.CMD_DATA, Common.json2Map(jsonData))
					.exception(LogConstants.EXCEPTION, (Exception) je).message("jsonData[" + jsonData + "]").logOpr();
		} catch (NullPointerException npe) {
			String error;
			// No need to retry the command.
			if (handler == null) {
				error = "No cmd handler for cmd: " + cmd + " jsonData: " + jsonData;
			} else {
				error = "NullPointerException by cmd handler of cmd: " + cmd + " jsonData: " + jsonData;
			}

			logger.error().field(LogConstants.METHOD, "handleCmd")
					.field(LogConstants.CMD_DATA, Common.json2Map(jsonData)).exception(LogConstants.EXCEPTION, npe)
					.message(error).logOpr();
		} catch (CmdHandlerException e) {
			logger.error().field(LogConstants.METHOD, "handleCmd")
					.field(LogConstants.CMD_DATA, Common.json2Map(jsonData)).exception(LogConstants.EXCEPTION, e)
					.logOpr();
			throw e;
		} catch (Exception e) {
			String error = "Pocessing error: " + e.getMessage() + " cmd: " + cmd + " jsonData: " + jsonData
					+ " cmdHandler: " + handler;

			logger.error().field(LogConstants.METHOD, "handleCmd")
					.field(LogConstants.CMD_DATA, Common.json2Map(jsonData)).exception(LogConstants.EXCEPTION, e)
					.logOpr();

			throw new CmdHandlerException(error);
		} finally {
			logger.info().field(LogConstants.METHOD, "handleCmd")
					.field(LogConstants.CMD_DATA, Common.json2Map(jsonData))
					.field(LogConstants.RESPONSE_TIME, System.currentTimeMillis() - startTime).logOpr();
		}
		return responseStr;
	}
}
