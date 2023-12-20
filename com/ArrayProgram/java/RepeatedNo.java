package com.ArrayProgram.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RepeatedNo {

	public static void main(String[] args) {
		int arr[]= {10,20,10,60,10,60,80,40,45,60,80};
		Set<Integer> s=new HashSet<Integer>();
		 int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
				{
					if(!s.contains(arr[i]))
					{
						s.add(arr[i]);
						
					}

				}
				
			}
		}
		System.out.println(s);
		
		
		
	

	}

}
