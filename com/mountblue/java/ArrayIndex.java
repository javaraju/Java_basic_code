package com.mountblue.java;

import java.util.HashSet;
import java.util.Set;

public class ArrayIndex {

	public static void main(String[] args) {
		int arr[]= {200,176,138,90,90,65,32,16,7};
		int arr1[]= {300,165,140,100,85,55,38,17,5,210};
		String s="";
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr1[i]>arr[j])
				{
					if(j-2>=0&&j-1>=0&&arr[j-2]==arr[j-1])
					{
						s=s+" "+(j);
						break;
					}
					else
					{
					s=s+" "+(j+1);
					break;
					}
				}
				else if(j+1>=arr.length)
				{
					s=s+" "+(arr.length+1);
					break;
				}
				
		    }
		}
		System.out.println(s);

	}

}
