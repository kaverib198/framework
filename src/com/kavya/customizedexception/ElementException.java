package com.kavya.customizedexception;

public class ElementException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ElementException() {
		super();
	}

	public ElementException(String ExceptionMessage) {
		super(ExceptionMessage);
	}
	
}
