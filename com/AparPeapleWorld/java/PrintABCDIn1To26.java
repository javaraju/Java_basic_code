package com.AparPeapleWorld.java;

import java.util.Scanner;

public class PrintABCDIn1To26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor:");
		char c=sc.next().charAt(0);
		if(c>=65&&c<=90)
		{
			int ch=(int)((char)64-c);
			System.out.println(-ch);	
		}
		else if(c>=97&&c<=122)
		{
			int ch=(int)((char)96-c);
			System.out.println(-ch);
		}

	}

}
