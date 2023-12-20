package com.Tracxn.java;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    } 	

	}

}
