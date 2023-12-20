package com.ArrayProgram.java;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={5,2,4,7,9,8,3,4,7,2,5,8,7,4,5,6,55,88,4};
		int max=array[0],min=array[0];
		for(int i=0;i<array.length;i++)
		{
		if(array[i]>max)
		{
		max=array[i];	
		}
		if(array[i]<min)
		{
			min=array[i];
		}
		}
		System.out.println("max value is:- "+max+" min value is:- "+min);

	}

}
