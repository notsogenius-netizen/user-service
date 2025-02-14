package com.sourabh.user_service.exception;

import org.springframework.http.HttpStatus;

public class DuplicateResourceException extends ApplicationException{
    public DuplicateResourceException(String message, HttpStatus statusCode){
        super(message, statusCode);
    }
}
