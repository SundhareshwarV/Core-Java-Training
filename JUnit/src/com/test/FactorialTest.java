package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.day13.Factorial;

public class FactorialTest {

	@Test
	public void testFactorial() {
		
		Factorial fact = new Factorial();
		int actual = fact.factorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}








