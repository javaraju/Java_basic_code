package com.ArrayProgram.java;

public class missinngNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,5,6};
		int n=6;
		int sum=0;
		int totalSum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int missingNum=totalSum-sum;
		System.out.println("The Missing Number in Given Array is:- "+missingNum);

	}

}
