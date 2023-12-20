package com.Apps.Raju;

import java.util.Scanner;

public class AllPrimBetwn1toN {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a range of  Number:-");
		int first=sc.nextInt();
		int last=sc.nextInt();
		int count=0;
		for(int i=first;i<=last;i++)
		{
			
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
			count=0;
		}

	}

}
