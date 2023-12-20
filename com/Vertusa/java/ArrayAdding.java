package com.Vertusa.java;

public class ArrayAdding {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int k=0;
		int m=0;
		int n=1;
		int h=2;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i=m)
		{
			for(int j=i;j<=k;j++)
			{
				sum=sum+arr[j];							
			}
			m=m+n;
			n=n+2;
			k=k+h;
			h++;
			sb.append(sum);
			sum=0;			
		}
		System.out.println(sb);
	}
}
