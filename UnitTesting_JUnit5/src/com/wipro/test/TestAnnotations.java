package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestAnnotations {

	@ParameterizedTest
	@ValueSource(strings = {"apple","orange","kiwi","mango","guava"})
	void test(String item) {
		
		
			System.out.println(item);
			assertTrue(item.length() >= 5);
		
		
	}

	
	@RepeatedTest(3)
	public void repeatTest() {
		
		assertTrue(true);
		
	}
	
}
