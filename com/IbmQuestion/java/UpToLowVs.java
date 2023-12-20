package com.IbmQuestion.java;

import java.util.Arrays;
import java.util.Scanner;

public class UpToLowVs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entar a String");
				
		String str=sc.nextLine();
		System.out.println("Before Converting:-\n"+str+"\n");
		char ch[]=new char[str.length()];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			char c=str.charAt(i);
			if(c>=65&&c<=90)
			{
				ch[k++]=(char) (c+32);
			}
			else
			{
				ch[k++]=(char)(c-32);
			}
			
		}
		System.out.println("After Converting:-");
		for(char c:ch)
		{
			System.out.print(c);
			
		}
		
	}
	

}
