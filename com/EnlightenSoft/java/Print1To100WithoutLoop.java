package com.EnlightenSoft.java;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {
		int n=1;
		printNo(n);

	}
	public static void printNo(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			printNo(n+1);
		}
	}

}
