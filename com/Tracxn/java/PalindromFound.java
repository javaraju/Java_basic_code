package com.Tracxn.java;

public class PalindromFound {

	public static void main(String[] args) {
		String s="sumreversemnmesrborobrse";
		String result=longestPalindrome(s);
		System.out.println(result);
	}
		public static String longestPalindrome(String s) {
			if (s.isEmpty()) {
				return null;
			}
		 
			if (s.length() == 1) {
				return s;
			}
		 
			String longest = " "+s.charAt(0)+s.charAt(1);//s.substring(0, 1);
			for (int i = 0; i < s.length(); i++) {

				String tmp = helper(s, i, i);
				if (tmp.length() > longest.length()) {
					longest = tmp;
				}
		 
				tmp = helper(s, i, i + 1);
				if (tmp.length() > longest.length()) {
					longest = tmp;
				}
			}
		 
			return longest;
		}
		public static String helper(String s, int begin, int end) {
			while (begin >= 0 && end <= s.length() - 1
					&& s.charAt(begin) == s.charAt(end))
			{
				begin--;
				end++;
			}
			return s.substring(begin + 1, end);
		}
		
	}


