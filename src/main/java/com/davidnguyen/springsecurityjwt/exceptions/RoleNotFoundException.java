package com.davidnguyen.springsecurityjwt.exceptions;

public class RoleNotFoundException extends Exception {
    public RoleNotFoundException(String message) {
        super(message);
    }
}
