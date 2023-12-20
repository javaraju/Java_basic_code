package com.Apps.Raju;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();
		int m=n;
		int r,sum=0,mul=1;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("Sum of given no is:- "+sum);
		int re;
		while(m>0)
		{
			re=m%10;
			m=m/10;
			mul=mul*re;
		}
		System.out.println("Multiple of Given No is:- "+mul);
		if(mul==sum)
		{
			System.out.println("Given no is SpyNumber.");
		}
		else
		{
			System.out.println("Given number is not a Spy No.");
		}

	}

}
