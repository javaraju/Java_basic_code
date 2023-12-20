package com.importantcode.java;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		//String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			//reverse=reverse+input.charAt(i);
			Character ch=input.charAt(i);
			System.out.print(ch);
		}
		//System.out.println(reverse+" ");
		

	}

}
