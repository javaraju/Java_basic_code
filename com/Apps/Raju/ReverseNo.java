package com.Apps.Raju;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();
		while(n>0)
		{
			System.out.print(n%10);
			n=n/10;
		}

	}

}
