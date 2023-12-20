package com.importantcode.java;

import java.util.Arrays;
import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.println("String in Ascending Order:-");
		String str1=new String(ch);
		System.out.println(str1);
		System.out.println("String in Reverse order:-");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		

	}

}
