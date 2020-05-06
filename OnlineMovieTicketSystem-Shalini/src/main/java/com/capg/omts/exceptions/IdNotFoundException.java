package com.capg.omts.exceptions;

@SuppressWarnings("serial")	
public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String message) {
		super(message);
	}
	public IdNotFoundException(String message,Throwable e) {
		super(message,e);
	}
 
}
