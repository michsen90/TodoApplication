package com.application.rest.webservices.restfulwebservicesapplication.jwt.resources;
public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

