package com.huawei.test;

public class MargeArr {
	public static int[] fun(int[] arr,int[]arr1)
	{
		int temp[]=new int[arr.length+arr1.length];
		int i=0;int j=0;int k=0;int m=1;
		while(j<arr1.length&&i<arr.length)
		{
			
			temp[k++]=arr1[j++];
			
		      temp[k++]=arr[i++];
		     
		}
		while(j<arr1.length)
		{
			temp[k++]=arr[j++];
		}
		while(i<arr.length)
		{
			temp[k++]=arr[i++];
		}
		return temp;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9};
		int arr1[]= {2,4,6,8};
	    int temp[]=fun(arr,arr1);
	    for(int i=0;i<temp.length;i++)
	    {
	    	System.out.print(temp[i]+" ");
	    }
	    
		

	}

}
