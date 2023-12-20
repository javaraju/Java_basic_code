package com.Apps.Raju;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n=sc.nextInt();
		int m=n;
		int sum=1;
		while(n>0)
		{
			sum=sum*n;
			n--;
		}
		System.out.println("Factorial of "+m+" is:- "+sum);

	}

}
