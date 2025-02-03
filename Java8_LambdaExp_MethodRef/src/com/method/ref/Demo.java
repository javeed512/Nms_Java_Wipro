package com.method.ref;

import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {


		
		Consumer<String>  consumer1 = (String name)->{  System.out.println(name);};
		  
				consumer1.accept("javeed");
				
				
		Consumer<String>  consumer2 =   System.out::println;
				consumer2.accept("king");	
				consumer2.accept("tom");
				
				
				

	}

}
