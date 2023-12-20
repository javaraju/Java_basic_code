package com.Apps.Raju;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a  Number:-");
		int n=sc.nextInt();
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("Sum of No is:- "+sum);
	}

}
