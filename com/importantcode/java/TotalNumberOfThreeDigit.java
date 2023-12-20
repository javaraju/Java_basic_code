package com.importantcode.java;

public class TotalNumberOfThreeDigit {
		  public static void main(String[] args) {
		  // Write your code here
		  int amount=0;
		  for(int i=1;i<=4;i++)
		  {
		    for(int j=1;j<=4;j++)
		    {
		      for(int k=1;k<=4;k++)
		      {
		        if(k!=i&&k!=j&&i!=j)
		        {
		          amount++;
		          System.out.println(i+""+j+""+k);
		        }
		      }
		    }
		  }
		  System.out.println("Total number of amount is:-"+amount);
		 }
		}
