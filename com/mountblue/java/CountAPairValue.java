package com.mountblue.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountAPairValue {

	private static final String Iterater = null;

	public static void main(String[] args) {
		int arr[]= {1,3,46,1,3,9};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==47)
				{
					System.out.println(arr[i]+","+arr[j]);
					if(!set.contains(arr[i])||!set.contains(arr[j]))
					{
						set.add(arr[i]);
						set.add(arr[j]);
					}
					
				}
					
			}
		}
		System.out.println(set);
		int count=0;
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			Integer n=i.next();
			count++;
		}
		System.out.println(count-1);

	}

}
