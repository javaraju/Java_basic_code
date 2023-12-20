package com.Apps.Raju;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of random no u want:");
		int n=sc.nextInt();
		System.out.println("Enter the max value of Random Number:");
		int max=sc.nextInt();
		Random t=new Random();
		System.out.println("Randome no from 0 to "+max+" are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(t.nextInt(max));
		}

	}

}
