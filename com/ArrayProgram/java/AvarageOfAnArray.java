package com.ArrayProgram.java;

public class AvarageOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {6,88,44,5,22,3,66,9,8,9,6,2,1};
		int sum=0,aver;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum of an array is:- "+sum);
		aver=sum/array.length;
		System.out.println("Averege of an array is:- "+aver);

	}

}
