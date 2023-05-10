package com.labseq.controllers.exceptions;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<StandardError> objectNotFound(IllegalArgumentException e, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new StandardError(
                System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(),e.getMessage(),
                request.getRequestURI()
        ));
    }
}
