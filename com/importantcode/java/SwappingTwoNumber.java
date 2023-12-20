package com.importantcode.java;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping value of a is: "+a);
		System.out.println("After Swapping value of b is: "+b);  
		
	}

}
