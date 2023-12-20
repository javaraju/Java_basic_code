package com.Exam.java;

import java.util.Arrays;

public class Bin {

	public static void main(String[] args) 
	{
		int n=15;
		int a[]=bin(n);
		System.out.println(Arrays.toString(a));
	}
	static int[] bin(int n)
	{
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		int count=0;
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
		
				




}
