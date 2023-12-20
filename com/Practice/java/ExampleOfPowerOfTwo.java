package com.Practice.java;

import java.util.Arrays;

public class ExampleOfPowerOfTwo
{
	static int[] checkPowerOfTwo(int a[])
	{
		for(int i=0;i<a.length;i++)
			a[i]=powertwo(a[i]);
		return(a);
	}
	static int powertwo(int n)
	{
		if(n==1)
			return 1;
		if(n%2==1)
			return 0;
		return powertwo(n/2);
	}
	
public static void main(String[] args) {
	int a[]= {10,22,4,2,8,55,1024,88};
	a=checkPowerOfTwo(a);
			System.out.println(Arrays.toString(a));
}

				


		


	}


