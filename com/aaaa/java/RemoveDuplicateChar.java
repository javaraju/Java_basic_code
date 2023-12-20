package com.aaaa.java;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="java";
		String st="";
		for(int i=0;i<s.length();i++)
		{
			if(st.contains(""+s.charAt(i)))
			{
				continue;
			}
			else
			{
				st=st+s.charAt(i);
			}
			
		}
		System.out.println(st);

	}

}
