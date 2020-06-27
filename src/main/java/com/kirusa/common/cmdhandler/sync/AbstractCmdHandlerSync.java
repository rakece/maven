package com.kirusa.common.cmdhandler.sync;

import com.kirusa.handler.AbstractRcsCmdHandler;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;

public abstract class AbstractCmdHandlerSync extends AbstractRcsCmdHandler implements CmdHandlerSync {

	protected static final IvLogger logger = LoggerFactory.getLogger(AbstractCmdHandlerSync.class);

	protected String getErrMsg(Exception e) {
		String err = "Error: " + e.getMessage();

		logger.error().exception(LogConstants.EXCEPTION, e).log();

		return err;
	}
}
