package com.bptn.course._20_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {

	Calculator calc;
	
	@BeforeAll
	void initialize() {

		/*
		 * The methods with @BeforeAll are executed one time before all the
		 * tests.
		 * 
		 * For instance:
		 * 
		 * Database connections.
		 * Open a text file
		 */
		
		calc = new Calculator();
	}
	
	@BeforeEach
	void beforeEachTest() {
		/*
		 * The methods with @BeforeEach are executed one time before each test.
		 */
		System.out.println("@BeforeEach: Executed before each test.");
	}
	
	@Test
	void testFindMax() {

		/* 1,3,4,2 */
		
		
		int max = calc.findMax(new int[] {1,3,4,2});
		
		int expected = 4;
		
		assertEquals(expected, max, "the output was incorrect");
		
		max = calc.findMax(new int[] {10,13,41,20});
		expected = 41;

		assertEquals(expected, max, "the output was incorrect");
		
	}

	@Test
	void testFindMaxNegative() {
		
		/* 1,3,4,2 */
		
		
		int max = calc.findMax(new int[] {-12,-1,-3,-4,-2});
		
		int expected = -1;
		
		assertEquals(expected, max, "the output was incorrect");
		
		max = calc.findMax(new int[] {-22,-13,-10,-3,-7});
		expected = -3;
		
		assertEquals(expected, max, "the output was incorrect");
		
	}
}
