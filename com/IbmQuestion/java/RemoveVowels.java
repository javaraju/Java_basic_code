package com.IbmQuestion.java;

import java.util.Scanner;
public class RemoveVowels {
	public static String remove(String input)
	{
     	StringBuffer sb=new StringBuffer(input);
		for(int i=0;i<sb.length();i++)
		{
			//char c=input.charAt(i);
			switch(sb.charAt(i))
			{
			case('a'):
			case('e'):
			case('i'):
			case('o'):
			case('u'):
		     sb.deleteCharAt(i);
			i=i-1;
			break;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		System.out.println(remove(input));

	}

}
