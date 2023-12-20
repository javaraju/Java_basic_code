package com.Apps.Raju;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n=20;
		int sum=0;
		int a=0;
		int b=1;
		System.out.print("0  1 ");
		while(sum<n)
		{
			sum=a+b;
			if(sum>=n)
			{
				break;
			}
			System.out.print(" "+sum+" ");
			a=b;
			b=sum;
		}
		



	}

}
