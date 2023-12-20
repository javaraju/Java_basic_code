package com.Practice.java;

public class Mount1 {

	public static void main(String[] args) {
		String s="raju";
		String s1="YOGENDRA";
		String s2=cim(s,s1);
		System.out.println(s2);

	}
	static String cim(String s,String s1)
	{
		String s2="";
		int a=0,b=0;
		while(a<s.length()&&b<s1.length())
		{
			s2=s2+s.charAt(a++)+s1.charAt(b++);
		}
		while(a<s.length())
			s2=s2+s.charAt(a++);
		
		while(b<s1.length())
			s2=s2+s1.charAt(b++);
		return (s2);
		
	}

}
