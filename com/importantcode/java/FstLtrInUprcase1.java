package com.importantcode.java;

import java.util.Scanner;

public class FstLtrInUprcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		String str1[]=str.split(" ");
		//char ch='a';
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str1[i].length();j++)
			{
				if(j==0)
				{
					str1[j].toUpperCase();
				}
			}
		}
        for(String s:str1)
        {
        	System.out.println(s);
        }
	}

}
