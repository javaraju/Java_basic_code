package com.Mantis.java;

import java.util.Scanner;

public class BinaryConvesion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		StringBuffer sb=new StringBuffer();
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>=1)
		{
			r=n%2;
			n=n/2;
			sb.append(r);
			
			
		}
		//String s=sb.toString();
		System.out.println(sb);
		String reverse="";
		for(int i=sb.length()-1;i>=0;i--)
		{
			reverse=(reverse+sb.charAt(i));
		}
		//sb.reverse();
		//System.out.println(sb.toString());
		System.out.println(reverse);
	}

}
