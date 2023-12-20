package com.importantcode.java;
import java.util.Scanner;
public class TableDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		/*int a=sc.nextInt();
		int b=sc.nextInt();
		for(int  c=a;c<=b;c++)
		{
			System.out.println("Multiplication table of "+c);
			for(int d=1;d<=100;d++)
			{
				System.out.println(c+"*"+d+"= "+c*d);
			}
		}*/
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"= "+n*i);
		}
	}

}
