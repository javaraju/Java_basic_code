package com.Apps.Raju;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:-");
		int n=sc.nextInt();
		int flag=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag++;
				
			}
		}
		if(flag==1)
		{
			System.out.println("No is prime");
		}
		else 
			System.out.println("Not prime");
		
		

	}

}
