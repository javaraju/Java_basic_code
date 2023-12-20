package com.mountblue.java;

public class MaxDifferenceInArray {
	static int getMaxDiff(int[] arr)
	{
		int e1=0,e2=0;
		int maxVal=arr[1]-arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]>maxVal)
				{
					maxVal=arr[j]-arr[i];
					e1=i+1;
					e2=j+1;
				}
			}
		}
		System.out.println("MaxDifference of an Element between "+e1+" and "+e2);
		return maxVal;
	}

	public static void main(String[] args) {
		int arr[]= {20,50,8,9,11,30,40,70,50};
		int maxDiffernce=getMaxDiff(arr);
		System.out.println("And Value is: "+maxDiffernce);

	}

}
