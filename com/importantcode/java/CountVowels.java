package com.importantcode.java;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		//String str="rajukumarsoni";
		int count=0;
		char[] ch1=str.toCharArray();
		for(char c:ch1)
		//for(int i=0;i<str.length();i++)
			
		{
			//char c1=str.charAt(i);
			switch(c)
			{
			case('a'):
			case('e'):
			case('i'):
			case('o'):
			case('u'):
				count++;
				break;
			
			
			}
			
				
			
			
		}
		
		System.out.println(count);

	}

}
