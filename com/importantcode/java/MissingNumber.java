package com.importantcode.java;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int n=6;
		int sum=0;
		int eSum=n*(n+1)/2;
		for(int a:arr)
		{
			sum=sum+a;
		}
		int i=eSum-sum;
		System.out.println(i);
	}

}
