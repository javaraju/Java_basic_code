package com.ArrayProgram.java;

public class ArrContNoOrNot {
	public static boolean fun(int []arr,int n)
	{
		for(int a:arr)
		{
			if(a==n)
		    return true;
		}
		return false;
		
	}
 
	public static void main(String[] args) {
		int arr[]= {5,8,9,6,3,4,2,1,7};
		int n=2;
		boolean b=fun(arr,n);
		System.out.println(b);

	}

}
