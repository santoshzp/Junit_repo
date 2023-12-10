package com. santosh.util;

public class MainDemo {
	public static void main(String[] args) {
		
		System.out.println("************Arithmatic Operation**************");
		ArithmaticOperation arithmaticOperation = new ArithmaticOperation();
		Integer add = arithmaticOperation.add(10,20,30);
		
		System.out.println("Add=="+ add);
		
		
		System.out.println("******************Palimedrome Check***********");
		PalindromeCheck pc = new PalindromeCheck();
		String str = "madam";
		boolean palindrom = pc.isPalindrom(str);
		if(palindrom)
			System.out.println(str+ "is Palimdrom"+palindrom);
		else
			System.out.println(str+ "is Not Palimdrom"+palindrom);
	}
}
