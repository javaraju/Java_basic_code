package com.importantcode.java;

import java.util.Scanner;

public class SecondToHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number in second");
		long l=sc.nextLong();
		int a=(int)l%60;
		int b=(int)l/60;
		int c=(int)b%60;
		b=b/60;
		System.out.println(a+"h:"+b+"m:"+c+"s");
		

	}

}
