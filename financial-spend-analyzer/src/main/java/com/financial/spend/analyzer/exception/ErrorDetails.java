package com.financial.spend.analyzer.exception;

public class ErrorDetails {

	private String statusCode;
	private String message;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public ErrorDetails() {
		this.statusCode = statusCode;
		this.message = message;
		
	}

}