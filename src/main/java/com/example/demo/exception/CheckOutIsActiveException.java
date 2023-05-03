package com.example.demo.exception;

public class CheckOutIsActiveException extends AbstractCheckoutException{

    public CheckOutIsActiveException(String msg) {
        super(msg);
    }
}
