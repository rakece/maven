package com.kirusa.exception;

public class SkipProcessingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SkipProcessingException(String err) {
		super(err);
	}
}