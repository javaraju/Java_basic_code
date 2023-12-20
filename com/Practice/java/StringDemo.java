package com.Practice.java;

public class StringDemo {
	static String micx(String s,String s1)
	{
		int i=0,j=0;
		String s2="";
		while(i<s.length()&&j<s1.length())
			s2=s2+s.charAt(i++)+s1.charAt(j++);
		while(i<s.length())
			s2=s2+s.charAt(i++);
		while(j<s1.length())
			s2=s2+s1.charAt(j++);
		return(s2);


	}

	public static void main(String[] args)
	{
		String s="pyar";
		String s1="MOHABAT";
		
		String s2=micx(s,s1);
		System.out.println(s2);



	}

}
