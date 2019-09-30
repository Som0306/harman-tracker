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

	public ResponseUtil sucessMessage() {
		return new ResponseUtil(object, httpStatus, reason);
	}
	
	public ResponseUtil failureMessage() {
		return new ResponseUtil(object, httpStatus, reason);
	}
	
	
}
