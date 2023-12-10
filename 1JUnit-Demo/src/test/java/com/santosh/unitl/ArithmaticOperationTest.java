package com.santosh.unitl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.santosh.util.ArithmaticOperation;

public class ArithmaticOperationTest {
	
	@Test
	public void addTest() {
		ArithmaticOperation ar = new ArithmaticOperation();
		
		int actualResult = ar.add(10,20);
		int expected = 30;
		assertEquals(expected, actualResult);
	}
	
	@Test
	public void divTest() {
		ArithmaticOperation ar = new ArithmaticOperation();
		
		int actualResult = ar.div(10, 2);
		int expected = 5;
		assertEquals(expected, actualResult);
	}

}
