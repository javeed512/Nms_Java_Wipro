package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.wipro.calsi.Calculator;

class CalculatorTest {
	
	static Calculator cal;
	
	@BeforeAll
	public static void beforeAll() {
		
		cal = new Calculator();
		
		System.out.println("Before All test cases...");
		
		// open file
		// get DB connection
		// start server or initial setup
		
	}
	
	
	@AfterAll
	public  static void  afterAll() {
		
		System.out.println("After All test cases...");
		
		// close files
		// close DB connection
		// clear or clean memories ...
		
	}
	
	@BeforeEach
	public  void before() {
		
		System.out.println("Before Each test case");
		
	}
	
	
	@AfterEach
	public  void after() {
		
		System.out.println("After Each test case");
		
	}

	@Test
	@DisplayName(value="Add Test")
	//@RepeatedTest(3)
	void testAdd() {

		

		int actual = cal.add(5, 5);

		assertEquals(10, actual);
		
		System.out.println("add tested..");

	}

	@Test
	//@Disabled
	void testSub() {

		

		int actual = cal.sub(15, 3);

		// assertEquals(12 , actual);

		// assertNotEquals(1, actual);

		assertTrue(actual > 10);

		assertNotNull(cal);
		
		System.out.println("sub tested...");

	}

}
