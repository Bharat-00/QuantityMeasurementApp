package com.bharat.exception;
public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message);
    }
}