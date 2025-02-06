package com.wipro.myapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testAdd() {


			App app = new App();
			
		int n1 =	app.add(4, 5);
			
			assertEquals(9, n1);
		
	}
	
	@Test
	public void  test() {
		
		
		assertTrue(true);
		
	}
	

}
