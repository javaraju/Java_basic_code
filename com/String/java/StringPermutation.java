package com.String.java;

public class StringPermutation {
	public static void permut(String str,String str1)
	{
		if(str1.length()==0)
		{
			System.out.println(str);
		}
	    else
	    {for(int i=0;i<str1.length();i++)
		{
		permut(str+str1.charAt(i),
		str1.substring(0, i)+str1.substring(i+1,str1.length()));
		}
		}
	}

	public static void main(String[] args) {
		String str1="ABC";
		String str="";
		permut(str,str1);

	}

}
