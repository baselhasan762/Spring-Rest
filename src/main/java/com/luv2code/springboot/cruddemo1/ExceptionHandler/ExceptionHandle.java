package com.luv2code.springboot.cruddemo1.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandle extends RuntimeException {

    public ExceptionHandle(String message) {
        super(message);
    }


}
