package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.wipro.java.Calculator;

@Tag("development")
public class AdditionTest {

	@Test
	@Tag("add")
	void testAdd() {

		Calculator cal = new Calculator();

		assertEquals(10, cal.add(5, 5));

	}

	@Test
	@Tag("add")
	void testAdd2() {

		Calculator cal = new Calculator();

		assertEquals(30, cal.add(15, 15));

	}

}
