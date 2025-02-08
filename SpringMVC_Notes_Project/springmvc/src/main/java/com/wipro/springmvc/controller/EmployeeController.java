package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springmvc.beans.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
	
			@RequestMapping(value = "/hello" , method = RequestMethod.GET)
			@ResponseBody
			public String  sayHello() {
				
					
				
				
				return "Hello Friends! <br>  <h1>Welcome to SpringMVC</h1>";
			}
	
	
			@RequestMapping(value = "/get" , method = RequestMethod.GET)
		
			public String   getEmpData(HttpServletRequest request,HttpServletResponse response) {
				
				
				System.out.println(request);
				System.out.println(response);
				
				return  "display";  // view name
				
				
			}
			
			
			@RequestMapping(value = "/add" , method = RequestMethod.POST)
	public String   addEmp(@ModelAttribute Employee emp , HttpSession session ) {
				
					
				session.setAttribute("emp", emp);
				
				//model.addEmp(emp);
				
				return "success";  // success.jsp view
				
				
			}
			
			
			
			

}
