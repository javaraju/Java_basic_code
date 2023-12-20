package com.huawei.test;

import java.util.Scanner;

public class StringPermu {
	public static void permut(char[] arr,int k)
	{
		if(k==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i=k;i<arr.length;i++)
			{
				char temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				
				permut(arr,k+1);
				
				temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length of char:");
		int n=sc.nextInt();
		char arr[]=new char[n];
		System.out.println("Enter a char:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		permut(arr,0);
		sc.close();
	}

}
