package com.Apps.Raju;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Two Word:");
		String str=sc.nextLine();
		String str1=sc.nextLine();
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
		{
			System.out.println(str+" and "+str1+" are Anagram.");
		}
		else
		{
			System.out.println(str+" and "+str1+" are not Anagram.");
		}
	}

}
