package com.reimpliment.java;

import java.util.Scanner;

public class TableDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int mul=1;
		System.out.println("Table of "+n+" is:-");
		for(int i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
		}

	}

}
