package com.Practi222.java;

public class LongestPalindrom {

	public static void main(String[] args) {
		String s="sumreversemnmesrborobrse";
		String result=palindrom(s);
		System.out.println(result);

	}
	public static String palindrom(String s)
	{
		String longest=s.substring(0, 1);
		for(int i=0;i<s.length();i++)
		{
			String temp=helper(s,i,i);
			if(temp.length()>longest.length())
			{
				longest=temp;
			}
		    /* temp=helper(s,i,i+1);
			if(temp.length()>longest.length())
			{
				longest=temp;
			}*/		
		}
		return longest;
	}
	public static String helper(String s,int beg,int end)
	{
		while(beg>=0&&end<s.length()&&s.charAt(beg)==s.charAt(end))
		{
			beg--;
			end++;	
		}
	
	return s.substring(beg+1,end);
	}

}
