package com.importantcode.java;

public class PrintNoWithoutUsingLoop {

	public static void main(String[] args) {
		printNumber(1);
		

	}
	private static void printNumber(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			printNumber(n+1);
		}
	}

}
