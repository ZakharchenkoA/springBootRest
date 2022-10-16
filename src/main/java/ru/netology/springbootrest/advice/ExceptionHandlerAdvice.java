package ru.netology.springbootrest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.springbootrest.exception.InvalidCredentials;
import ru.netology.springbootrest.exception.UnauthorizedUser;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials (InvalidCredentials e) {
        return new ResponseEntity<>( "ERROR: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser (UnauthorizedUser e) {
        return new ResponseEntity<>("ERROR: " + e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
