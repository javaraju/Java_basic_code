package com.Apps.Raju;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two no:-");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Before Swapping n is:- "+n+"    "+"m is:- "+m);
		n=n^m;
		m=n^m;
		n=n^m;
		/*n=n+m;
		m=n-m;
		n=n-m;*/
		System.out.println("After Swapping n is:- "+n+"    "+"m is:- "+m);

	}

}
