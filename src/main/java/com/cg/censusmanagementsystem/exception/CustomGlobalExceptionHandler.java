package com.cg.censusmanagementsystem.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(EnumeratorNotFoundException.class)
    public ResponseEntity<Object> handleBookNotFound(EnumeratorNotFoundException u) throws IOException {
    	return new ResponseEntity<>(u.getLocalizedMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	
}
