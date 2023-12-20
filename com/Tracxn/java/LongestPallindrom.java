package com.Tracxn.java;

public class LongestPallindrom {
	public static void main(String[] args)
	{
	String input="sumreversemnmesrborobrse";
	String longest=longestPalindrome(input);
	System.out.println(longest);
	}

	public static String longestPalindrome(String s) {
	    if(s==null || s.length()<=1)
	        return s;
	 
	    int len = s.length();
	    int maxLen = 1;
	    boolean [][] dp = new boolean[len][len];
	 
	    String longest ="";
	    for(int l=0; l<len; l++)
	    {
	        for(int i=0; i<len-l; i++)
	        {
	            int j = i+l;
	            if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1]))
	            {
	                dp[i][j]=true;
	 
	                if(j-i+1>maxLen)
	                {
	                   maxLen = j-i+1; 
	                   longest = s.substring(i, j+1);
	                }
	            }
	        }
	    }
	    System.out.println(maxLen);
	 
	    return longest;
	}
}
