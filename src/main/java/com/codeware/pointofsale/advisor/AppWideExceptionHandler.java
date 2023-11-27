package com.codeware.pointofsale.advisor;

import com.codeware.pointofsale.excaption.NotFoundException;
import com.codeware.pointofsale.util.StandardResponce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class  AppWideExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponce> HandleNotFoundException(NotFoundException e){
        return new ResponseEntity<StandardResponce>(new StandardResponce(404, "Error Coming", e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
