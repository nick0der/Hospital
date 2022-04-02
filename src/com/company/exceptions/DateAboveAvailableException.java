package com.company.exceptions;

public class DateAboveAvailableException extends Exception{
    public DateAboveAvailableException(String message) {
        super(message);
    }
}