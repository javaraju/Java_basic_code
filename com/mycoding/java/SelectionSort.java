package com.mycoding.java;

import java.util.Arrays;

public class SelectionSort {
	
		static void sorting(int []arr)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				int minIndex=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[minIndex])
					{
						minIndex=j;
						
					}
				}
				int smallerNumber=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=smallerNumber;
			}
			System.out.println(Arrays.toString(arr));
		}

		public static void main(String[] args) {
			int arr[]= {11,2,8,9,3,7,4};
			sorting(arr);

		}

	}

