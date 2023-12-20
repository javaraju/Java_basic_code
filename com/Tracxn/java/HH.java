package com.Tracxn.java;

public class HH {

	static int sumOf(int n,int count)
	{
		int sum=0;
		while(count>0)
		{
			sum=sum+n;
			n=n+2;
			count--;
		}
		/*int start=n;
		 * for(int i=1;i<=count;i++)
		{
			sum=sum+start*i;
		}*/
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(sumOf(2,6));	}

}
