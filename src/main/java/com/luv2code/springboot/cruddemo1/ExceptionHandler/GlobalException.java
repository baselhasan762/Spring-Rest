package com.luv2code.springboot.cruddemo1.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler
    public ResponseEntity<String> handleException(ExceptionHandle ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception ex){
        return new ResponseEntity<>("An Error Occurred: "+ex.getMessage(),HttpStatus.BAD_REQUEST);
    }

}
