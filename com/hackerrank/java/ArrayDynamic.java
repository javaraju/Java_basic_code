package com.hackerrank.java;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDynamic {
	static int[] notMatching(int[]arr1,int[]arr2,int len)
	{
		int result[]=new int[len];
		int k=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<=i;j++)
			{
				if(arr1[i]!=arr2[j])
				{
					result[k++]=1;
				}
			}
		}
		int newResult[]=new int[k];
		System.arraycopy(result, 0, newResult, 0, k);
		result=newResult;
		return newResult;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		int arr2[]=new int[len];
		System.out.println("Enter element of First Array:");
		for(int i=0;i<len;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter element of Second Array:");
		for(int i=0;i<len;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int result[]=notMatching(arr1,arr2,len);
		System.out.print("Non Matching Array Element Is: ");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		

	}

}
