package com.reimpliment.java;
import java.util.Scanner;
public class FibonacciDemo {
	public static void main(String[] args)
	{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int k=0,a=1,b=1;
    System.out.print("1 1");

	while(k<=n) {
		k=a+b;
		if(k>=n)
			break;
		System.out.print(" "+k);
		a=b;
		b=k;
	}	
	}

}
