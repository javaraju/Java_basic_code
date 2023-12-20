package com.Practice.java;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CharFoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		System.out.println("Enter a Character");
		char ch=sc.next().charAt(0);
		char ch1[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			char ch22=str.charAt(i);
			if(ch22==ch)
			{
				count++;
			}
			//System.out.println(count);
		}
		System.out.println(count);
		
		
	    
	    
		

	}

}
