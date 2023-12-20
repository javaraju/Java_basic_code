package com.Practice.java;

import java.util.Arrays;

public class ArrayMix {

	public static void main(String[] args) {
		int a[]= {10,22,45,12,55,88};
		int b[]= {20,25,15,44,66,33,27,49,50,41,99};
		int c[]=arr(a,b);
		System.out.println(Arrays.toString(c));
		


	}
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

}
