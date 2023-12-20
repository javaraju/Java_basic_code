package com.importantcode.java;

import java.util.Scanner;

public class SquarRoot {
public static int b;
public static float c;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		System.out.println("Sqrt of "+number+" is:-");
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				for(int j=1;j*j<=number;j++)
				{
					b=j;
				}
			}
			else
			{
                for(float k=1f;k*k<=number;k=k+0.00001f)
				{
					c=k;
				}
			}
		}
		if(number==b*b)
			System.out.println(b);
		else 
			System.out.println(c);
	}

}
