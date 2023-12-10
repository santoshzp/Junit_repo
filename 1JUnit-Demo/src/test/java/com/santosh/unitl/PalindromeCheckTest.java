package com.santosh.unitl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.santosh.util.PalindromeCheck;

public class PalindromeCheckTest {
	
	
	@ParameterizedTest
	@ValueSource(strings = {"madam"})
	public void isPalimdromTest(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		
		boolean actualResult = pc.isPalindrom(str);
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Santosh"})
	public void isPalimdromNegTest(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		
		boolean actualResult = pc.isPalindrom(str);
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
	}

}
