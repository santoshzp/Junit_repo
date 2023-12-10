package com.santosh.util;

public class ArithmaticOperation {

	
	public Integer add(int ... number) {
		 Integer add = 0;
		for(int num : number) {
			add+=num;
		}
		return add;
	}
	
	public Integer div(int num1,int num2) {
		
		return num1/num2;
	}
}
