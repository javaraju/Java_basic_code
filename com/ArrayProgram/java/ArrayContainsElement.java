package com.ArrayProgram.java;

public class ArrayContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {555,888,444222,333,666,222,999,777,111,444};
		System.out.println(contain(array,333));
		System.out.println(contain(array,000));

	}
	public static boolean contain(int arr[],int item)
	{
	for(int a:arr)
	{
		if(a==item)
			return true;
	}
	return false;
	}

}
