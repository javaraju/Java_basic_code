package com.AparPeapleWorld.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,temp=n;
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number in not palindrome");
		}

	}

}
