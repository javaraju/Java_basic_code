package com.Tracxn.java;

import java.util.Scanner;

public class EvenOddChar {
	public static String function(String str,int flag)
	{
		String str1="";
		if(flag==0)
		{
			for(int i=0;i<str.length();i+=2)
			{
				str1=str1+str.charAt(i);
			}
		}
		else
		{
			for(int i=1;i<str.length();i+=2)
			str1=str1+str.charAt(i);
		}
		return str1;



	}

	public static void main(String[] args) {
		String str="TRACXN";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 or 1");
		int flag=sc.nextInt();
		if(flag==0||flag==1)
		{
		String result=function(str,flag);
		System.out.println(result);
		}
		else
		{
			System.out.println("Sorry Invalid input pls try again Thankyou:-");
		}



	}

}
