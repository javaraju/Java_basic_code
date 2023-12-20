package com.reimpliment.java;
import java.util.*;
public class PallindromeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str=sc.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		if(str1.equals(str))
		{
			System.out.println("Given String is Pallindrome");
			
		}
		else
		{
			System.out.println("Given String is not Pallindrome");
		}

	}

}
