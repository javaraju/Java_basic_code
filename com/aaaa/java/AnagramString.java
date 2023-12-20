package com.aaaa.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s=sc.next();
		String s1=sc.next();

		/*String s="raju";
		String s1="ujar";*/
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
		{
			System.out.println("Given String is Anagram.");
		}
		else
		{
			System.out.println("not Anagram.");
		}



	}

}
