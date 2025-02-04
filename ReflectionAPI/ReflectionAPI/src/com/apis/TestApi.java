package com.apis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class TestApi {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("com.apis.Employee");
		
		

		Constructor constructors[] = c.getConstructors();
		
		for (Constructor constructor : constructors) {
			
			System.out.println("Constructor Name "+constructor);
			
			System.out.println("Constructor Params count "+constructor.getParameterCount());
		
			
		Parameter[] parameters =	constructor.getParameters();
		
				for (Parameter parameter : parameters) {
					
					System.out.println("Constructor's Parameters "+parameter); 
					
				}
		
		
			
		}
		
				
		
		

	}

}
