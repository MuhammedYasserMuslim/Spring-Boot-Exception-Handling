package com.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> handlerNotFound(RecordNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), Arrays.asList(ex.getMessage()));
        return ResponseEntity.
                status(HttpStatus.NOT_FOUND).
                body(errorResponse);
    }
}
