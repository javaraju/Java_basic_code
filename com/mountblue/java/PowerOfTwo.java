package com.mountblue.java;

import java.util.Arrays;

public class PowerOfTwo {
	static int[] checkPowerOfTwo(int a[])
	{
		
	for(int i=0;i<a.length;i++)
		
	a[i]=powertwo(a[i]);
	
	return a;
	}
	static int powertwo(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		else if(n%2==1)
		{
			return 0;
		}
		return powertwo(n/2);
	}
	

	public static void main(String[] args) {
		int a[]= {4,8,52,1024,6,16,55,44,88,325,52};
		/*int c[]=checkPowerOfTwo(a);
		int i=0;
		for(int c:a)
		{
			a[i++]=powertwo(c);
		}*/
		a=checkPowerOfTwo(a);
		System.out.println(Arrays.toString(a));

	}

}
