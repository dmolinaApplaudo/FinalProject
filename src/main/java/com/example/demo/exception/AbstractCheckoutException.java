package com.example.demo.exception;

public abstract  class AbstractCheckoutException extends RuntimeException{

    private String message;

    AbstractCheckoutException(String msg){
        super(msg);
        this.message = msg;
    }

}
