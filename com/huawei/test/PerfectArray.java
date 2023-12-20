package com.huawei.test;

import java.util.Scanner;

public class PerfectArray {
	public static int fun(int a)
	{
	int sum=0;
	for(int i=1;i<=a/2;i++)
	{
		if(a%i==0)
		{
			sum=sum+i;
			
		}
	}
	return sum;
	}

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10,12,14,16};
		int d;
		int n;
		for(int i=0;i<array.length;i++)
		{   d=array[i];
		    n=fun(array[i]);
		    if(n==d)
			{
				System.out.println(array[i]+" is Perfect.");
			}
			else
			{
				System.out.println(array[i]+" is not Perfect.");
			}
		}
		
		}


		


	}


