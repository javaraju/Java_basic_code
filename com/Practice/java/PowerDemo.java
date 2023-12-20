package com.Practice.java;

import java.util.Arrays;

public class PowerDemo {
	static int[] powerTwo(int a[])
	{
		for(int i=0;i<a.length;i++)
		a[i]=poweragain(a[i]);
		return a;
	}
	static int poweragain(int n)
	{
		if(n==1)
			return 1;
		if(n%2==1)
			return 0;
		return poweragain(n/2);
	}

	public static void main(String[] args) {
		int a[]= {2,5,4,6,8,2,44,66,1024,16,32,64,55,100};
		a=powerTwo(a);
		System.out.println(Arrays.toString(a));

	}

}
