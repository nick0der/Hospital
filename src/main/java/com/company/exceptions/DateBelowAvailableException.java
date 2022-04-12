package com.company.exceptions;

public class DateBelowAvailableException extends Exception{

    public DateBelowAvailableException(String message) {
        super(message);
    }
}
