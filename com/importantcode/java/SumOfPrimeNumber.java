package com.importantcode.java;
import java.util.*;
public class SumOfPrimeNumber {

	public static void main(String[] args) {
		
		int sum=0;
		int no=0;
		
		for(int j=1;j<=100;j++)
		{
			int count=0;
			
		for(int i=1;i<=j/2;i++)
		{
			if(j%i==0)
			{
				count++;
			}
			
		}
		if(count==1)
		    {
			   no++;
               sum=sum+j;
               System.out.print(j+" ");
		    }
		
		}
		System.out.println("\n"+"Total Prime no is:- "+no);
		
		System.out.println("\n"+"Sum of 1 to 100 Prime no is= "+sum);
		
			
	}

}
