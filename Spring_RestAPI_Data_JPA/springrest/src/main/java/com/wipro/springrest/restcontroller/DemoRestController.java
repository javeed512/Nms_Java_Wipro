package com.wipro.springrest.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.entity.Employee;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController {

	@GetMapping("/hello")
	public String hello() { // resource or end point

		return "Hello Friends";

	}

	@PostMapping("/insert")
	public String createEmployee(@RequestBody Employee emp) {

		return "Record inserted " + emp;

	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {

		return "Data updated " + emp;

	}

	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable int eid) {

		return "Record Deleted " + eid;

	}
	
	
	@GetMapping("/div/{a}/{b}")
	public  int    div(@PathVariable int a,  @PathVariable int b) {
		
		String name = null;
		
		name.length();
		
		return  a/b;
		
	}
	
	
	/*
	 * @ResponseStatus(reason = "sorry , you can't divide number by zero",code =
	 * HttpStatus.NOT_ACCEPTABLE)
	 * 
	 * @ExceptionHandler(ArithmeticException.class) public void exceptionHandler() {
	 * 
	 * System.out.println("Exception Handle by method");
	 * 
	 * }
	 * 
	 * 
	 * @ExceptionHandler(Exception.class) public ResponseEntity<String> handleExp(){
	 * 
	 * 
	 * return new ResponseEntity<String>("Null Value Found",HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 * 
	 */

}
