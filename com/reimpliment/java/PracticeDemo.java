package com.reimpliment.java;

public class PracticeDemo {

	public static void main(String[] args) {
		int a[]= {1,-2,4,-5,1};
		int sum=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(j==i)
				{
					sum=a[i];
				}
				else
				{
					sum=sum+a[j];
				}
				if(sum<0)
				{
				count++;
				}
				
			}
		}
		System.out.println(count);

	}

}
