package com.reimpliment.java;
import java.util.Scanner;
public class CountVowelDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
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
