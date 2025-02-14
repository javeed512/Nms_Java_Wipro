package com.wipro.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ResponseStatus(reason = "Employee Not Found",code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public  void  expHandlerEmp() {
		
		
		
	}
	
	
	
	
	

	@ResponseStatus(reason = "sorry , you can't divide number by zero",code = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(ArithmeticException.class)
	public  void  exceptionHandler() {
		
		System.out.println("Exception Handle by method");
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public  ResponseEntity<String>  handleExp(){
		
		
		return new ResponseEntity<String>("Null Value Found",HttpStatus.BAD_REQUEST);
		
	}
	
	
		
	

}
