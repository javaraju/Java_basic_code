package com.ArrayProgram.java;

public class ArrrayElementFounder {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,90};
		int index=3;
		int element=90;
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				System.out.println("Element of given Index "+index+" is: "+arr[i-1]);
			}
			else if(arr[i]==element)
			{
				System.out.println("Index no of an element "+element+" is: "+i);
			}
		}
		

	}

}
