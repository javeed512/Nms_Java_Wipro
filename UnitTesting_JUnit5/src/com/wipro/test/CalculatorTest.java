package com.wipro.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.wipro.java.Calculator;

@DisplayName("Test Calculator Class")
class CalculatorTest {

	static Calculator cal;

	@BeforeAll
	public static void beforeAll() {

		cal = new Calculator();
		
		System.out.println("Before All only once");

	}
	
	@AfterAll
	public static  void afterAll() {
		
		
		System.out.println("After All only once");
	}
	
	
	@BeforeEach
	public void   beforeEach() {
		
		System.out.println("Before Each test case");
		
	}
	
	@AfterEach
	public void  afterEach() {
		
		System.out.println("After Each test case");
		
	}
	
	

	@Test
	@DisplayName("Test ADD")
	@Tag("t1")
	void testAdd() {

		int actual = cal.add(5, 5);

		assertEquals(10, actual);
		
		System.out.println("add tested");

	}

	@Test
	@DisplayName("Test SUB")
	
	@Tag("t1")
	void testSub() {

		int actual = cal.sub(15, 5);

		assertEquals(10, actual);
		
		System.out.println("sub tested");

	}

	@Test
	@Disabled
	void testMul() {

		int actual = cal.mul(5, 2);

		assertEquals(10, actual);
		
		System.out.println("mul tested");

	}
	
	@Test
	void testDiv() {
		
		String name = "javeed";
	
		assertThrows(NullPointerException.class, ()->{ System.out.println(name.length()); });
		
		
	}
	
	
	
	
	
	

}
