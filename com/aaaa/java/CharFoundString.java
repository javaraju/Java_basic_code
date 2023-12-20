package com.aaaa.java;

import java.util.Scanner;

public class CharFoundString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		
		String s=sc.next();
		System.out.println("Enter Search character");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			//char ch=s.charAt(i);
			if(s.charAt(i)==c)
			{
				++count;
				
			}
			
		}
		System.out.println("character found "+count+" times.");

	}

}
