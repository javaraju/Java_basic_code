package com.AparPeapleWorld.java;

import java.util.Scanner;

public class FibonacciSeriese {
	public static int fun(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
			return(fun(n-1)+fun(n-2));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(fun(i)+" ");
		}

	}

}
