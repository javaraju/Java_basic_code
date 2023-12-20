package com.Apps.Raju;

import java.util.Scanner;

public class FactorialOfEachNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a range of  Number:-");
		int first=sc.nextInt();
		int last=sc.nextInt();
		int mul=1;
		
		for(int i=first;i<=last;i++)
		{
			for(int j=i;j>0;j--)
			{
				mul=mul*j;
			}
			System.out.println("Factorial of "+i+" is:- "+mul);
			mul=1;
		}
     }
  }
