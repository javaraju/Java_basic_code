package com.reimpliment.java;

import java.util.Scanner;

public class fibonacciDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0,a=0,b=1;
		System.out.print("0 1");
		while(sum<=n)
		{
			sum=a+b;
			if(sum>n)
			break;
			System.out.print(" "+sum);
			a=b;
			b=sum;	
		}
			
	}

}
