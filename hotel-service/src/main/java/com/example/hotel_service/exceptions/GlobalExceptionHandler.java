package com.example.hotel_service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.hotel_service.Response;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Response> handlerResourceNotFoundException(ResourceNotFoundException ex) {

		String message = ex.getMessage();
		Response response = Response.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();

		return new ResponseEntity<Response>(response, HttpStatus.NOT_FOUND);
	}

}
