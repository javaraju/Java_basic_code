package com.aaaa.java;

import java.util.Scanner;
import java.util.Spliterator;

public class ArmstrongNo {
	static int result(int r,int no)
	{
		int b=1;
		while(no>0)
		{
			b=b*r;
			no--;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();// 153, 370, 371, 407, 1634, 8208, 9474, 54748
		String s=String.valueOf(n);
		int no=s.length();
		int r=0,sum=0,t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+result(r,no);
		}
		if(sum==t)
		{
			System.out.println("Given no is Armstrong No.");
		}
		else
			System.out.println("Given No is Not Armstrong No!");

	}

}
