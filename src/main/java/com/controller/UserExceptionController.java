package com.controller;

import org.springframework.expression.AccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class UserExceptionController {
	
	
	@ExceptionHandler(AddUserException.class)
	public ResponseEntity<?> handleAddIdException(AddUserException ex, WebRequest req){
		return new ResponseEntity<> (ex.toString(), HttpStatus.NOT_FOUND);
	
	}
	@ExceptionHandler(DeleteUserException.class)
	public ResponseEntity<?> handleDeleteIdException(DeleteUserException ex, WebRequest req){
		return new ResponseEntity<> (ex.toString(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AccessException.class)
	public ResponseEntity<?> handleAddUserException(AccessException e, WebRequest req){
		return new ResponseEntity<> (e.toString(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UpdateUserException.class)
	public ResponseEntity<?> handleUpdateException(UpdateUserException ex, WebRequest req){
		return new ResponseEntity<> (ex.toString(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(GetUserException.class)
	public ResponseEntity<?> handleGetException(GetUserException ex, WebRequest req){
		return new ResponseEntity<> (ex.toString(), HttpStatus.NOT_FOUND);
	}
}
