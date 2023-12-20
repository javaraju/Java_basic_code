package com.Apps.Raju;

import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();//n=9,sqr=9*9=81,sum of sqr=8+1=9:-here n==sum.
		int sqr=n*n;
		System.out.println("Sqr of Number is:- "+sqr);
		int r,sum=0;
		while(sqr>0)
		{
			r=sqr%10;
			sqr=sqr/10;
			sum=sum+r;
		}
		System.out.println("Sum of Sqr of Number is:- "+sum);
		if(sum==n)
		{
			System.out.println("Given Number Is Neon Number.");
		}
		else
		{
			System.out.println("Given Number is Not a Neon Number.");
		}

	}

}
