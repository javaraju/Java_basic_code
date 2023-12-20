package com.importantcode.java;
import java.util.Scanner;
public class AarmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int r,sum=0, t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(t==sum)
			System.out.println("Number is Aarmstrong Number");
		else
			System.out.println("Number is Not Armstrong Number");
		

	}

}
