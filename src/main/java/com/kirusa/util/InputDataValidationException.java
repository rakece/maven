package com.kirusa.util;

public class InputDataValidationException extends Exception{
	private static final long serialVersionUID = 1L;

	public String errKey;
	public InputDataValidationException(String errKey)
	{   super(errKey);
		this.errKey = errKey;
	}
}
