package com.Practice.java;

import java.util.Arrays;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=i+1;
		}
		System.out.println("first way");
		System.out.println(Arrays.toString(arr));
		System.out.println("second way");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Third way");
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		
		

	}

}
