package com.Practice.java;

import java.util.Scanner;

public class CircularPrime {
	static int count2=0;
	static void isprime(int p)
	{
		int count=0;
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0)
				count++;
		}
		if(count==0)
		{
			count2++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		String s=""+n;
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char temp;
		temp=ch[0];
		for(int j=1;j<ch.length;j++)
		{
			ch[j-1]=ch[j];
		}
		ch[ch.length-1]=temp;
		int p=Integer.parseInt(String.valueOf(ch));
		isprime(p);
		}
		if(count2==4)
		{
			System.out.print(n+" is circular Prime Number");
			
		}
		else
			System.out.println(n+" is not circular prime number");
		

	}

}
