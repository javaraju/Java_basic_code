package com.Apps.Raju;

import java.util.Scanner;

public class StrongNo {
	public static int fun(int r)
	{
		int mul=1;
		while(r>0)
		{
			mul=mul*r;
			r--;
		}
		return mul;
	}

	public static void main(String[] args) {
		// 145=1!+4!+5!=1+24+120=145 sum of its 
		//no of digits Factorial.
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+fun(r);
		}
		System.out.println("Sum of factorial of digits of that Number is:- "+sum );
		if(sum==temp)
		{
		System.out.println("Given no is Strong Number. ");
		}
		else
		{
			System.out.println("Given Number is not a Strong number.");
		}
	}

}
