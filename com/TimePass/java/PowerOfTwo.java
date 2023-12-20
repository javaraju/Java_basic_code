package com.TimePass.java;

import java.util.Arrays;

public class PowerOfTwo {
	public static int[] fun(int[] c)
	{
		int i=0;
		for(int v:c)
		{
			c[i++]=powr(v);
		}
		return c;
	}
	static int powr(int v)
	{
		if(v==1)
		{
			return 1;
		}
		else if(v%2==1)
		{
			return 0;
		}
		return (powr(v/2));
		
	}

	public static void main(String[] args) {
		int arr[]= {2,5,6,4,10,20,32,75,11};
		arr=fun(arr);
		System.out.println(Arrays.toString(arr));

	}

}
