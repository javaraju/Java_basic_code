package com.reimpliment.java;
import java.util.*;
public class FactorialDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>=0)
			
		{
			long s=1;
			for(int i=n;i>=1;i--)
			{
				s=s*i;
			}
			System.out.println("Factorial of "+n+"is: "+s);
		}
		



	}

}
