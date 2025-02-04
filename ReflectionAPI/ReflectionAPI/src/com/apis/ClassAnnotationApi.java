package com.apis;

import java.lang.annotation.Annotation;

public class ClassAnnotationApi {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("com.apis.Employee");

		
		  Class[] classes = c.getDeclaredClasses();
		  
		  for (Class class1 : classes) {
		  
		  System.out.println("Class " + class1);
		  
		  System.out.println("Class Name " + class1.getName());
		  
		  }
		 
		
		  
		  System.out.println("Annotation in Employee class");
		
			Annotation[]  annotations =			c.getDeclaredAnnotations();
			
					for (Annotation annotation : annotations) {
						
						System.out.println("Annotation "+annotation);
						
					}
		

	}

}
