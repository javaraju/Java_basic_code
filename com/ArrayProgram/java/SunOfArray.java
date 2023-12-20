package com.ArrayProgram.java;

public class SunOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {55,88,22,11,44,6,8,5,3,1,8,9,7,55,22,11,33};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<array.length;i++)
		{
			sum1+=array[i];
		}
		System.out.println("Sum of an Array is:- "+sum1);
		for(int sum:array) 
		{
			sum2+=sum;
		}
		System.out.println("Sum of an Array is:- "+sum2);

	}

}
