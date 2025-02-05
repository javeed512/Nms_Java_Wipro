package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.wipro.java.Calculator;

@Tag("production")
public class SubstractionTest {

	
	
	@Test
	@Tag("sub")
	void testSub() {


			Calculator cal = new Calculator();
			
			assertEquals(0, cal.sub(5, 5));
		
		
	}

}
