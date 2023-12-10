package com.santosh.util;

public class PalindromeCheck {
	
	public boolean isPalindrom(String str) {
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		if(str.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;
	}

}
