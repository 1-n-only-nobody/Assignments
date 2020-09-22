package com.training.exceptions;

public class MyCustomException extends Exception {

	private String message;
	private Throwable cause;

	public MyCustomException(String message, Throwable cause) {
//		super(message, cause);
		super();
		this.message = message;
		this.cause = cause;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception message : " + this.message + this.cause.getMessage();
	}
	
	
}
