package com.harman.infotracker.util;

import org.springframework.http.HttpStatus;

public class ResponseUtil {
	
	private Object object;
	private HttpStatus httpStatus;
	private String reason;
	
	public ResponseUtil(Object object, HttpStatus httpStatus, String reason) {
		super();
		this.object = object;
		this.httpStatus = httpStatus;
		this.reason = reason;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
}
