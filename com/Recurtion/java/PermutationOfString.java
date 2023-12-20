package com.Recurtion.java;

public class PermutationOfString {
	public static void permut(char[]arr,int n)
	{
		if(n==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i=n;i<arr.length;i++)
			{
				char temp=arr[n];
				arr[n]=arr[i];
				arr[i]=temp;
				
				permut(arr,n+1);
				
				temp=arr[n];
				arr[n]=arr[i];
				arr[i]=temp;
				
			}
		}
	}

	public static void main(String[] args) {
		String s="ABC";
		char arr[]=s.toCharArray();
		permut(arr,0);
		

	}

}
