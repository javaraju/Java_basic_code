package com.Apps.Raju;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int n=sc.nextInt();
		if((n%400==0)||((n%4==0)&&(n%100!=0)))
		{
			System.out.println("Year is Leap Year.");
		}
		else
		{
			System.out.println("Year is not a leap year.");
		}

	}

}
