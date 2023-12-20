package com.Tracxn.java;

public class Recursion {
			static int fun(int n)
			{
				if(n==1)
				{
					return 0;
				}
				else
					return n*fun(n-1);
			}

		 public static void main(String[] args) {
			int n=10;
			int result=fun(n);
			System.out.println(result);
		
	}

}
