package com.Practice.java;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		
		
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90,100 ,110};

		/*for(int i = 0; i < array.length; i++) {
		if (i % 2 == 0) {
		for (int j = i+1; j < array.length; j++) {
		if (array[i] < array[j]) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		}
		}
		} else {
		for (int j = i+1; j < array.length; j++) {
		if (array[i] > array[j]) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		}
		}
		}
		}*/
		int n=arr.length;
		int ini=-1;
		int lst=n;
		for(int i=0;i<n/2;i++)
		{
		
			System.out.print(arr[++ini]+" ");
			System.out.print(arr[--lst]+" ");
			
		}
		if(n%2==1)
		{
			System.out.println(arr[n/2]);
		}

	
	}

}
