package com.reimpliment.java;
import java.util.*;
import java.lang.*;

public class D1 {
		 
		    public static void main (String [] args) {
		    Scanner input = new Scanner (System.in);
		 
		    String name = "";
		    boolean continueInput = true;
		 
		    do {
		        System.out.print("Please enter your name: ");
		 
		        try {
		        name = input.nextLine();
		        continueInput = false;
		         
		        }
		        catch(InputMismatchException ex) {
		        System.out.println("Oops! Please enter your name.");
		        input.nextLine();
		        }
		 
		    } while(continueInput);
		 
		    System.out.println("Hello " + name + "!");
		 
		 
		 
		    }

	}


