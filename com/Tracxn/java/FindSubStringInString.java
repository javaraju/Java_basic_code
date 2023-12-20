package com.Tracxn.java;

public class FindSubStringInString {

	public static void main(String[] args) {
		
		String str="rajukumar";
		String s="uku";
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(j==s.length())
			{
				break;
			}
			
			else if(s.charAt(j)==str.charAt(i))
			{
				j++;
			}
			else
			{
				j=0;
			}
		}
		if(j==s.length())
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("No!");
		}
	}

}
