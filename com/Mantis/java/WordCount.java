package com.Mantis.java;
	import java.util.Scanner;

	public class WordCount {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the paragraph:");
			String st1=sc.nextLine();
			System.out.println("Enter the word to be count ");
			String st2=sc.nextLine();
			
			int count=0;
			int k=0;
			for(int j=0; j<st1.length();j++ )
			{		
				   if(k==st2.length())
				     {
				    	count++;
					    k=0;
				     }
				   if(st2.charAt(k)==st1.charAt(j))
					 { 
						k++;
					 }
				   else
					 {					   
						k=0;
					 }										
			}
			if(k==st2.length())
			{
				count++;
			}
		    System.out.println("word counts:: "+count);
	    }
	}

