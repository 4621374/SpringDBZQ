package com.dbzq.exception;

public class CustomException extends Exception {
   private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public CustomException(String message) {
	super(message);
	this.message=message;
	// TODO Auto-generated constructor stub
}
   
}
