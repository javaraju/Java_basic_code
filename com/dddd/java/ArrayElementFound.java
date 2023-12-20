package com.dddd.java;

public class ArrayElementFound {

	public static void main(String[] args) {
		int array[]= {555,666,1101,220,325,645,789,452,154};
		System.out.println(contains(array,555));
		System.out.println(contains(array,1101));
		}
	public static boolean contains(int arr[],int value)
	{
		for(int c:arr)
		{
			if(c==value)
			{
				return true;
			}
			
		}
		return false;
	}

}
