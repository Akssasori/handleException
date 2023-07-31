package com.handle.exception.handle;

import com.handle.exception.dto.ErrorResponseDTO;
import com.handle.exception.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public final ResponseEntity<ErrorResponseDTO> handleResponseException(Exception ex) {
        ErrorResponseDTO error = new ErrorResponseDTO(ex.getMessage(), HttpStatus.CONFLICT.value());
        System.out.println("eror :" +  ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }
}
