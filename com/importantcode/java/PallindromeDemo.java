package com.importantcode.java;
import java.util.*;
public class PallindromeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r,s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
		if(s==t)
		{
			System.out.println("no is pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}

	}

}
