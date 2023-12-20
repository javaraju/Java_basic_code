package com.huawei.test;

public class SecondLastLargElement {

	public static void main(String[] args) {
		int arr[]= {50,40,20,80,90,60,100,45,10};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int a:arr)
		{
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-2]);
		

	}

}
