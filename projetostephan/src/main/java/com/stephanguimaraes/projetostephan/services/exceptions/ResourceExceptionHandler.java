package com.stephanguimaraes.projetostephan.services.exceptions;

import com.stephanguimaraes.projetostephan.resources.exceptions.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(),httpStatus.value(),error,e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(httpStatus).body(err);
    }

    @ExceptionHandler(DataBaseExceptions.class)
    public ResponseEntity<StandardError> dataBase(DataBaseExceptions e, HttpServletRequest request){
        String error = "Data base error ";
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(),httpStatus.value(),error,e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(httpStatus).body(err);
    }
}
