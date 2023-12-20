package com.Practice.java;

import java.util.Scanner;

public class Tracxn1 {
	public static String fun1(String str,int flag)
	{
		String result="";
		if(flag==0)
		{
			for(int i=0;i<str.length();i+=2)
			{
				result+=str.charAt(i);
			}
		}
		else
		{
			for(int i=1;i<str.length();i+=2)
			{
				result+=str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str="TRACXN";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of flag 0 or 1");
		int flag=sc.nextInt();
		String result=fun1(str,flag);
		System.out.println(result);
				

	}

}
