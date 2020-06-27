package com.kirusa.common.cmdhandler.sync;

import com.kirusa.common.cmdhandler.CmdHandlerException;

public class CmdNotSupportedException extends CmdHandlerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CmdNotSupportedException(String msg){
		super(msg);
	}
}
