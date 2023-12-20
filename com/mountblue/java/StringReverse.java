package com.mountblue.java;

public class StringReverse {

	public static void main(String[] args) {
		String s="RAJUKUMARso123";
		String temp="";
		for(int i=0;i<s.length();i=i+3)
		{
			if(i+2<=s.length()-1)
			{
			temp=temp+s.charAt(i+2)+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+2<=s.length())
			{
				temp=temp+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+1<=s.length())
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
    }

}
