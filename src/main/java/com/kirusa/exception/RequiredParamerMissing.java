package com.kirusa.exception;

public class RequiredParamerMissing extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int errCode = 1;// system error

	public RequiredParamerMissing(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}
}
