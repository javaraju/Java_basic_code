package com.Tracxn.java;

public class ReverseString1 {

	public static void main(String[] args) {
		int n=12345678;
		while(n>0)
		{
			System.out.print(n%10);
			n=n/10;
		}
	}

}
