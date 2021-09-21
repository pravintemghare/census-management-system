package com.cg.censusmanagementsystem.exception;

public class EnumeratorNotFoundException extends RuntimeException {

	public EnumeratorNotFoundException(String email) {
        super("User Id not found : " + email);
    }
	
}
