package com.Practice.java;

import java.util.Arrays;
import java.util.Scanner;


public class ZPattern{ 
	

	public static void main(String[] args) {
		int n=3;
		int a=n/2+1;
		int count=1;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n;j++)
		  {
			  if(i==1||i==n||j==n-i+1)
			  
			  System.out.print(count++);
			  
			  else
			  
				  System.out.print(" "); 
		  }
		  System.out.println(); 
	  }
	 
	}
}


	




