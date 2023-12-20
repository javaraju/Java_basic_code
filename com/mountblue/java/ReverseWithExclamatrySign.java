package com.mountblue.java;

public class ReverseWithExclamatrySign {

	public static void main(String[] args) {
		String s="raju kumar soni ranjita kumari";
		s=s.replace(" ","!");
		String s1="";
		for(int i=0;i<s.length();i+=3)
		{
			if(i+2<=s.length()-1)
			{
				s1=s1+s.charAt(i+2)+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+2<=s.length())
			{
				s1=s1+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+1<=s.length())
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
