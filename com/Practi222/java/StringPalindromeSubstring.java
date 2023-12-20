package com.Practi222.java;

public class StringPalindromeSubstring {

	public static void main(String[] args) {
		String s="sumreversemnmesrborobrse";
		String result=palindrome(s);
		System.out.println(result);
     }
	public static String palindrome(String s)
	{
		String str=s.substring(0,1);
		int n=s.length();
		for(int i=0;i<s.length();i++)
		{
			String temp=helper(s,i,i);
			if(temp.length()>str.length())
			{
				str=temp;
			}
			temp=helper(s,i,i+1);
			if(temp.length()>str.length())
			{
				str=temp;
			}
					
		}
		return(str);
	}
	public static String helper(String s,int begin,int end)
	{
		while(begin>=0&&end<=s.length()-1&&s.charAt(begin)==s.charAt(end))
		{
			begin--;
			end++;
		}
		return s.substring(begin+1, end);
	}

}
