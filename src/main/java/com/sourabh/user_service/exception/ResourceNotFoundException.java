package com.sourabh.user_service.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApplicationException{
    public ResourceNotFoundException(String message, HttpStatus statusCode){
        super(message, statusCode);
    }
}