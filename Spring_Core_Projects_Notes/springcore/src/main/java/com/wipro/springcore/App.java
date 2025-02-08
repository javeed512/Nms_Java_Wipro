package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.wipro.springcore.bean")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring core" );
        
        
       ApplicationContext  context = 	  new AnnotationConfigApplicationContext(App.class);  // IOC Container
       
       			Employee emp1 =		context.getBean("e1",Employee.class);  // byName
       
       			System.out.println(emp1);
       			Employee  	emp2 =		context.getBean(Employee.class);  // byType
       			
       			System.out.println(emp2);
       
    }
}
