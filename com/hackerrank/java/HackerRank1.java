package com.hackerrank.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank1 {
  public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		         Scanner sc = new Scanner(System.in);
		        int i=1;
		        System.out.println("Enter any sentence any no of time:");
		        while (sc.hasNext()) {
		        	String s=sc.nextLine();
		        	System.out.println(i + " " + s);
		        	i++;
		        }
		

	}

}
