package com.aaaa.java;

public class NumtoWord {
public static void main(String[] args) {

	for(int i=220;i<230;i++)
	{
		String a= (""+i);
		int b= (""+i).length();
		for(int j=b-1;j>=0;j--)
		System.out.println(a.charAt(j)-46);
		
	}
}
}