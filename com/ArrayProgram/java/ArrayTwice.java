package com.ArrayProgram.java;

import java.util.HashSet;
import java.util.Set;

public class ArrayTwice {

	public static void main(String[] args) {
		int arr[]= {10,10,20,50,30,30,40,30,90,90,100,60};
		for(int i=1;i<arr.length;i++)
		{
			if(i+1>=arr.length)
			{
				System.out.println(arr[i]);
				break;
			}
			if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}