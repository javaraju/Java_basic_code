package com.aaaa.java;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
//	static int[] bubbleSort(int []array)
//	{
//		int temp;
//		for(int i=0;i<array.length-1;i++)
//		{
//			for(int j=i+1;j<array.length;j++)
//			{
//				if(array[i]>array[j])
//				{
//				temp=array[i];
//				array[i]=array[j];
//				array[j]=temp;
//				}
//			}
//		}
//		return array;
//
//	}
//
//	public static void main(String[] args) {
//		int array[]= {10,50,22,44,11,6,9,4,55};
//		int sortArray[]=bubbleSort(array);
//		/*for(int a:sortArray)
//		{
//			System.out.println(a);
//		}
//		*/
//		System.out.println(Arrays.toString(sortArray));

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array length.");
	int length = sc.nextInt();
	int [] arrayOfInt = new int[length];
	System.out.println("Enter array values.");
	for (int i=0;i<length;i++){
		arrayOfInt[i] = sc.nextInt();
	}
	int[] sortedArray = sortedArray(arrayOfInt);
	System.out.println(Arrays.toString(sortedArray));

}
static int[] sortedArray(int [] data){
	for (int i=0; i<data.length-1;i++){
		for (int j=i; j<data.length;j++) {
			if (data[i] > data[j]) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
	}
	return data;
}

}
