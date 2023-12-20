package com.Apps.Raju;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		System.out.println("Enter power:");
		int m=sc.nextInt();
		int power=1;
		int t=m;
		while(m>0)
		{
			power=power*n;
			m--;
		}
		System.out.println(n+" to the power "+t+" is: "+power);

	}

}
