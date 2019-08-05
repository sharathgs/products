package com.hcl.product.exception;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date timestamp;
	private String message;
//	private String details;
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorResponse(Date timestamp, String message) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		//this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
