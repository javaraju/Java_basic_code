package com.Practice.java;

public class PrimeDemo {

	public static void main(String[] args) {
		int n=7;
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		System.out.println("no is Prime");	
		}
		else
			System.out.println("no is not prime");



	}

}
