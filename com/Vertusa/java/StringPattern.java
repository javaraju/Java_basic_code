package com.Vertusa.java;

public class StringPattern {

	public static void main(String[] args) {
		String s="aaabccdddeeeeffffaaafffalll";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i+1>=s.length())
			{
				s1=s1+s.charAt(i);
				break;
			}
			if(s.charAt(i)==s.charAt(i+1))
			{
				i=i+1;
				continue;				
			}
			else
			{
				s1=s1+s.charAt(i);				
			}					
		}
		System.out.println(s1);
	}
}
