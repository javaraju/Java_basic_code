package com.Apps.Raju;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even number.");
		}
		else
		{
			System.out.println(n+" is Odd number.");
		}

	}

}
