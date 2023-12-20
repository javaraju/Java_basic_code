package com.Tracxn.java;

public class SubString {

	public static void main(String[] args) {

		String s="Nikhilku",t="khil";
		int j=0;
		System.out.println(t.length());
		for(int i=0;i<s.length();i++)
		{
			if(j==t.length())
			{
				break;
			}
			else if(t.charAt(j)==s.charAt(i))
			j++;
			else
		    j=0;
			
		}
		if(j==t.length())
		System.out.println("Yes");
			else
			{
				System.out.println("No");
			}
	}

}
