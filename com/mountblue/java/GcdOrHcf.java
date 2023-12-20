package com.mountblue.java;

import java.util.Scanner;

public class GcdOrHcf {
	static int gcd(int x,int y)
	{
		int i;
		for(i=x;i>=1;i--)
		{
			if(x%i==0&&y%i==0)
			{
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inter The No./enter 0 to Exit.");
		int x;
		int y=-1;
		while(true)
		{
		    x=sc.nextInt();
			if(x==0)
			break;
			else if(y==-1)
				y=x;
			else if(x<y)
				y=gcd(x,y);
			else
				y=gcd(y,x);
			
		}
		System.out.println(y);

	}

}
