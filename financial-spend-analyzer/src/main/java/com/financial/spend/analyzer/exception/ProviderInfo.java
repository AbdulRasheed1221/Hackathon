package com.financial.spend.analyzer.exception;


public class ProviderInfo {
	
	private String statusCode;
	private String message;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String string) {
		this.statusCode = string;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ProviderInfo [statusCode=" + statusCode + ", message=" + message + "]";
	}


}
