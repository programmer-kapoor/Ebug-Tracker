package com.Ebug.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.ALREADY_REPORTED) 
public class UserAlreadyRegisterd extends RuntimeException {
	private String msg;
	private String statusCode;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public UserAlreadyRegisterd() {
		super();
	}

	public UserAlreadyRegisterd(String msg, String statusCode) {
		super();
		this.msg = msg;
		this.statusCode = statusCode;
	}
	
}
