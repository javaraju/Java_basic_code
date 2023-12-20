package com.collection.java;

public class NewLogic {

	public static void main(String[] args) {
		String s="My Name Is Raju";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				s2=s1+" "+s2;
				s1="";
			}
		}
		System.out.println(s1+" "+s2);

	}

}
