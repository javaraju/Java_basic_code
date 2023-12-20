package com.Apps.Raju;

import java.util.Scanner;

public class ArmstrongNo {
	public static int fun(int r,int len)
	{
		int mul=1;
		while(len>0)
		{
			mul=mul*r;
			len--;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String n=sc.nextLine();
		int m=Integer.valueOf(n);
		int temp=m;
		int len=n.length();
		int r;
		int sum=0;
		while(m>0)
		{
			r=m%10;
			m=m/10;
			sum=sum+fun(r,len);
			
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{System.out.println("Number is not a Armstrong Number");
		
		}

	}

}
