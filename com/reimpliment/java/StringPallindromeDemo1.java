package com.reimpliment.java;

import java.util.Scanner;

public class StringPallindromeDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println(reverse.toString());
		if(reverse.equals(original))
		{
			System.out.println("Given String is Pallindrom");
		}
		else
			System.out.println("Given String is not Pallindrom");
	}

}
