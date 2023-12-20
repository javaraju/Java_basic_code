package com.pppp.raju;

import java.util.Scanner;

public class MixChar {
	public static String mix(String s,String s1)
	{
		String result="";
		int i=0,j=0;
		while(i<s.length()&&j<s1.length())
		{
		result=result+s.charAt(i++)+s1.charAt(j++);
		}
		while(i<s.length())
		{
			result=result+s.charAt(i++);
		}
		while(j<s1.length())
		{
			result=result+s1.charAt(j++);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Two Words:-");
		String s=sc.next();
		String s1=sc.next();
		String result=mix(s,s1);
		System.out.println("After mix of word \n"+result);

	}

}
