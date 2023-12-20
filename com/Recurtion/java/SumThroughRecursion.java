package com.Recurtion.java;

public class SumThroughRecursion {
	public static int sum(int n)
	{
		int s;
		if(n==1)
		{
		    return n;
		}
		else
		{
			s=n+sum(n-1);
			return s;
		}
		
	}

	public static void main(String[] args) {
		int n=10;
		int result=sum(n);
		System.out.println("Sum of "+n+" is: "+result);
		

	}

}
