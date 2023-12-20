package com.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class isPrime2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number:");
		String n=scan.next();
        BigInteger b=new BigInteger(n);
        boolean B=b.isProbablePrime(50);
        if(B)
        	{
        	System.out.println("prime");
        	}
        else
        	{
        	System.out.println("not prime");
        	}

	}

}
