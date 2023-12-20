package com.pppp.raju;

import java.util.Arrays;

public class BineryPosition {
	public static int[] bin(int n)
	{
		String s=Integer.toBinaryString(n);
		String temp="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			count++;
		}
		int array[]=new int[count+1];
		array[0]=count;
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				array[++j]=i+1;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int n=15;
		int arr[]=bin(n);
		System.out.println(Arrays.toString(arr));

	}

}
