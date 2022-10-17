package com.younseo.team8.handler;

import com.younseo.team8.dto.response.ResponseDto;
import com.younseo.team8.handler.customexception.WrongInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {

    //벨리드의 에러
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleValidationExceptions(MethodArgumentNotValidException e) {

        List<com.younseo.team8.handler.MyError> errors = new ArrayList<>();

        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            errors.add(new com.younseo.team8.handler.MyError(fieldError.getField(), fieldError.getDefaultMessage()));
        }
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errors);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity handleIllegalArgumentException(IllegalArgumentException e) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new com.younseo.team8.handler.MyError(HttpStatus.BAD_REQUEST.getReasonPhrase(), e.getLocalizedMessage()));
    }

    @ExceptionHandler(WrongInputException.class)
    public ResponseEntity handleWrongInputException(WrongInputException e) {


        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new com.younseo.team8.handler.MyError(HttpStatus.BAD_REQUEST.getReasonPhrase(), e.getLocalizedMessage()));
    }
}
