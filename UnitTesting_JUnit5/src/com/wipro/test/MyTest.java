package com.wipro.test;

import static java.lang.System.err;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class MyTest   {

	@Test
	
	void test() {
		
		assertEquals(5, (2 + 3));   // TDD
		
		out.println("test executed..");
		
		err.print("Tested");
		
		
		
		
	}

}
