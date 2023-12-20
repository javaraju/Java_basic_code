package com.reimpliment.java;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfBigValue {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int n=sc.nextInt();
BigInteger big=BigInteger.ONE;
for(int i=1;i<=n;i++) {
	big=big.multiply(BigInteger.valueOf(i));
}
System.out.println("Factorial of "+n+" is:- "+big);


	}

}
