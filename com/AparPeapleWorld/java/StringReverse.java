package com.AparPeapleWorld.java;

public class StringReverse {

	public static void main(String[] args) {
		String s="Hello World";
		String st="";
		/*for(int i=0;i<s.length();i++)
		{
			st=s.charAt(i)+st;
		}
		System.out.println(st);*/
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
		}
		System.out.println(st);

	}

}
