package com.apis;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MethodsReflectionApi {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
			Class c =		Class.forName("com.apis.Employee");
			
				Method methods[] =		c.getDeclaredMethods();
				
				for (Method method : methods) {
					
					System.out.println("Method Name  "+method);
					System.out.println("Method Return type "+method.getReturnType());
					System.out.println("Method Params count "+method.getParameterCount());
					
				
					
					
					  Parameter[] parameters = method.getParameters();
					  
					  
					  for(Parameter param : parameters) {
					  
					  
					  System.out.println("Method's Params "+param);
					  
					  
					  }
					  
						System.out.println();
					 
				}
			

				
				
				
				
	}

}
