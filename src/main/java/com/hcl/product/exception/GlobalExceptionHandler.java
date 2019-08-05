package com.hcl.product.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.hcl.product.exception.UserException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	/*
	 * @ExceptionHandler(Exception.class) public ResponseEntity<ErrorResponse>
	 * globalExceptionHandler(Exception exception, WebRequest webRequest) {
	 * ErrorResponse errorResponse = new ErrorResponse(new Date(),
	 * exception.getMessage(), webRequest.getDescription(false));
	 * 
	 * return new
	 * ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR)
	 * ; }
	 */
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorResponse> handleUserException(UserException exception)
	{
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage());
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	
}
