package com.hcl.product.dto;

public class ResponseDto {
	
	private String message;

	public ResponseDto(String message) {
		super();
		this.message = message;
	}

	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
