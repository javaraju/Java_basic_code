package com.importantcode.java;
import java.util.Scanner;
public class StringPallindromeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
	   String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(reverse.equals(original))
		{
		System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}

	}

}
