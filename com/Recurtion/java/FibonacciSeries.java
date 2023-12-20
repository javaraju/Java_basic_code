package com.Recurtion.java;

public class FibonacciSeries {
	public static long fun(long n)
	{
		if(n==1||n==2)
		
			return 1;
			return (fun(n-1)+fun(n-2));
		
	}

	public static void main(String[] args) {
		for(int i=1;i<15;i++)
		{


		System.out.println(fun(i)+" ");
		}

	}

}
