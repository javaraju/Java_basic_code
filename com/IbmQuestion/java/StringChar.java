package com.IbmQuestion.java;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String str=sc.nextLine();
		System.out.println("Enter the desire Character:-");
		char ch=sc.next().charAt(0);
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c==ch)
			{
				System.out.println("Desire charactor is:- "+c);
				//flag=1;
				
			}
			else if(i==str.length())
			{
				System.out.println("Desire character "
						+ "is not available in given String.");
			}
		}
		/*if(flag==1)
        {
		System.out.println("Desire charactor is:- "+ch);
        }
		
		else
		{
			System.out.println("Desire character "
					+ "is not available in given String.");
		}*/



	}

}
