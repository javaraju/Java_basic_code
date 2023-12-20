package com.mountblue.java;

public class ArrayDemo {
	static String mix(String s,String s1)
	{
		int i=0,j=0;
		String s2="";
		while(i<s.length() && j<s1.length())
		{
			s2=s2+s.charAt(i++);
			s2=s2+s1.charAt(j++);
		}
		while(i<s.length())
		{
		s2=s2+s.charAt(i++);
		}
		while(j<s1.length())
		{
			s2=s2+s1.charAt(j++);
		}
		return(s2);
		
				
	}

	public static void main(String[] args) {
		String s="mountblue";
		String s1="hackerrank";
		String s2=mix(s,s1);
		System.out.println(s2);

	}

}
