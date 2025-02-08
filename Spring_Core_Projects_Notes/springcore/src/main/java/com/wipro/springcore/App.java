package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore.bean.Employee;
import com.wipro.springcore.service.EmployeeServiceImp;
import com.wipro.springcore.service.IEmployeeService;

@Configuration
@ComponentScan(basePackages = "com.wipro.springcore")
public class App 
{
    public static void main( String[] args ) // presentation layer
    {
        System.out.println( "Welcome to Spring core" );
        
        
       ApplicationContext  context = 	  new AnnotationConfigApplicationContext(App.class);  // IOC Container
       
       	IEmployeeService  service =	  context.getBean(EmployeeServiceImp.class);
       
       		
       	System.out.println("main called service");
       			service.getServiceInfo();
       	
		
		  Employee emp1 = context.getBean("e1",Employee.class); // byName
		  
		  System.out.println(emp1); Employee emp2 = context.getBean(Employee.class); 
		  //byType
		  
		  System.out.println(emp2);
		 
       
    }
    	@Bean("s1")
    	public  String   getStringObj() { // method is implicitly called by IOC when object is demanded using autowired
    		
    		return new String("object created using Bean annotation");
    		
    	}


}
