package com.Recurtion.java;

public class FactorialWithRecurtion {
	public static int fact(int n)
	{
		if(n>0)
		{
			return(n*fact(n-1));
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args) {
		int n=4;
		int result=fact(n);
		System.out.println("Factorial of "+n+" is: "+result);

	}

}
