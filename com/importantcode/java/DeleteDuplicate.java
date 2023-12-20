package com.importantcode.java;

import java.util.Arrays;

public class DeleteDuplicate {

	public static void main(String[] args) {
		int arr[]= {2,3,6,5,4,7,8,9,6,5,8,2,4};
		int n=arr.length;
		String s="";
		for(int i=0;i<n;i++)
		{
			if(s.contains(arr[i]+""))
			{
			    continue;
			}
			else
			{
			     s+=" "+arr[i];
			}	
			
			
		}
		System.out.println(s);
		
	}

}
