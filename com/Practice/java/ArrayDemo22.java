package com.Practice.java;

import java.util.Arrays;

public class ArrayDemo22
{
	static int[] arr(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
			if(a[i]>b[j])
				c[k++]=b[j++];
			else
				c[k++]=a[i++];
		while(i<a.length)
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
		return c;
	}

	public static void main(String[] args) 
	{
	int a[]= {10,20,47,48,52,62};
	int b[]= {1,2,14,25,62,98,102,199,147};
	int c[]=arr(a,b);
	System.out.println(Arrays.toString(c));
	



	}

}
