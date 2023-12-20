package com.Tracxn.java;

public class CountOfDigit {

	public static void main(String[] args) {
		long n=10000000000l;
		int c=1;
		while((n=n/10)!=0)
		{
			c++;
		}		
		System.out.println(c); 
	}
}
		
