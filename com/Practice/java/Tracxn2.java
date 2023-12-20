package com.Practice.java;

public class Tracxn2 {

	public static void main(String[] args) {
		int arr[]= {102,55,800,450,95,125,980};
		int max=0;
		int Day1=0;
		int Day2=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]>max)
				{
					max=arr[j]-arr[i];
					Day1=i+1;
					Day2=j+1;
				}
			}
		}
		System.out.println("Buy- "+Day1+" -sale- "+Day2+" -Profit+= "+max);
	}

}
