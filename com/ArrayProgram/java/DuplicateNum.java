package com.ArrayProgram.java;

public class DuplicateNum {

	public static void main(String[] args) {
		int []arr= {4,6,9,8,6,1,2,6,3,2,5,2};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
