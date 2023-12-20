package com.aaaa.java;

public class DeleteDuplicate {

	public static void main(String[] args) {
		int arr[]= {5,6,8,9,7,4,2,1,3,6,5,4,1,2};
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			if(s.contains(String.valueOf(arr[i])))
			{
				continue;
			}
			else
			{
				s=s+" "+arr[i];
			}
		}
		System.out.println(s);



	}

}
