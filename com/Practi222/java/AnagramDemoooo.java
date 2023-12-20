package com.Practi222.java;

import java.util.Arrays;

public class AnagramDemoooo {

	public static void main(String[] args) {
		String s="javam";
		String st="avaj";
		char ch[]=s.toCharArray();
		char ch1[]=st.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
		{
			System.out.println("Given no is Anagram");
		}
		else
		{
			System.out.println("Given no is not Anagram");
		}
		
	}

}


