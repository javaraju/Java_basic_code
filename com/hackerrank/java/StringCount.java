package com.hackerrank.java;

import java.util.Scanner;

public class StringCount {
	
	
	
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter two Word:");

	    String A = sc.next();
	    String B = sc.next();

	    char a1 = A.toUpperCase().charAt(0);
	    char b1 = B.toUpperCase().charAt(0);

	    int a = A.length();
	    int b = B.length();

	    int sum = a + b;

	    System.out.println("Sum of the both Word length is: "+sum);
	    System.out.println("Compare both Word First Char "
	    		+ "If First word is greater print YES otherwise No:");
	    

	    if (A.compareTo(B) > 0) {

	        System.out.println("yes");

	    } else {

	        System.out.println("No");

	    }
	    System.out.println("Both WOrd going to Combine:");
	        System.out.println(a1 + A.substring(1) +" "+ b1 +B.substring(1));

	}

}
