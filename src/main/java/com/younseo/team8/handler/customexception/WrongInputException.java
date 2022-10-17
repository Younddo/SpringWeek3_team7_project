package com.younseo.team8.handler.customexception;

public class WrongInputException extends RuntimeException{
    public WrongInputException(String message) {
        super(message);
    }

}
