package com.hackerrank.java;

import java.util.ArrayList;

public class UniqueArraySum {
	static int uniqueArraySum(int[] arr)
	{
		ArrayList<Integer> al=new ArrayList<Integer>(arr.length);
		al.add(arr[0]);
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			int val=arr[i];
			while(al.contains(val))
			{
				val++;
			}
			al.add(val);
			sum+=al.get(i);
		}
		/*for(int i=0;i<al.size();i++)
		{
			sum+=al.get(i);
		}*/
		return sum;
	}

	public static void main(String[] args) {
		int arr[]= {5,6,8,6,11};
		int sum=uniqueArraySum(arr);
		System.out.println(sum);

	}

}
