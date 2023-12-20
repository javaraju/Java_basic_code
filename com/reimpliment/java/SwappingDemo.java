package com.reimpliment.java;

import java.util.Scanner;

public class SwappingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping a= "+a+" and b= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a= "+a+" and b= "+b);


		



	}

}
