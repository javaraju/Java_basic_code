package com.TimePass.java;

import java.util.Arrays;

public class BinneryPrint {
	public static int[] fun(int n)
	{
		int count=0;
		String s=Integer.toBinaryString(n);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				count++;
			}
		}
		int arr[]=new int[count+1];
		arr[0]=count;
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				arr[++j]=i+1;
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int n=15;
		int arr[]=fun(n);
		System.out.println(Arrays.toString(arr));

	}

}
