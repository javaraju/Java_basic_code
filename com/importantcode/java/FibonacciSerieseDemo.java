package com.importantcode.java;
import java.util.Scanner;
public class FibonacciSerieseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0,a=1,b=1;
		System.out.print("1 1");
		while(sum<=n)
		{
			sum=a+b;
			if(sum>n)
			break;
			System.out.print(" "+sum);
			a=b;
			b=sum;	
			
		}
		

	}

}
