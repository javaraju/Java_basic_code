package com.importantcode.java;
//import java.io.IOException;
import java.util.Scanner;
public class CharFoundInString {

	public static void main(String[] args)//throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		System.out.println("Enter any Charector for Searching:");
		//char c=String.charAt(args[0]);
		char c = sc.next().charAt(0);
		//char c=(char)System.in.read();
		int charFound=0;
		//char ch1[]=s.toCharArray();
			//for(char c1:ch1)
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			//if(c1==c)
			if(ch==c)
				charFound++;
		}
		System.out.println(charFound);
	}

}
