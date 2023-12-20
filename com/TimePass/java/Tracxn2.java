package com.TimePass.java;

import java.util.Scanner;

public class Tracxn2 {
	static String fun(String str,int p)
	{
		String res="";
		if(p==0)
		{
			for(int i=0;i<str.length();i+=2)
			{
				res=res+str.charAt(i);
			}
		}
		else {
			for(int i=1;i<str.length();i+=2)
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str="TRACXN";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number.");
		int p=sc.nextInt();
		String res=fun(str,p);
		System.out.println(res);
	}
}
