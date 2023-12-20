package com.Apps.Raju;

import java.util.Scanner;

public class AutomorphiicNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();
		int num=n;
		int sqr=n*n;
		int r,sum=0,t=10;
		boolean b=false;
		while(n>0)
		{
			r=sqr%t;
			n=n/10;
			t=t*10;
			if(r==num)
			{
				b=true;
				break;
			}
			
			
		}
		if(b==true)
		{
			System.out.println("Given no is AutomorphicNo.");
		}
		else
		{
			System.out.println("given no is not Automorphic.");
		}
				
		

	}

}
