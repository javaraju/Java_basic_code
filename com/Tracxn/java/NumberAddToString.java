package com.Tracxn.java;

public class NumberAddToString {

	public static void main(String[] args) {
		String s="ra87juk5u123mar8975";
		String ss="";
		int sum=0;
		int temp=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>=48&&c<=57)
			{
				ss=ss+c;
			}
			else
			{
				int j=0;
				while(j<ss.length())
				{
				sum=sum*10+ss.charAt(j++)-'0';
				}
				temp=temp+sum;
				sum=0;
				ss="";
				
			}
		}
		int j=0;
		while(j<ss.length())
		{
		sum=sum*10+ss.charAt(j++)-'0';
		}
		temp=temp+sum;
		System.out.println(temp);

	}

}
