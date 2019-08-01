package com.hcl.product.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

	private Date timestamp;
	private String message;
	private String details;
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	
	
}
