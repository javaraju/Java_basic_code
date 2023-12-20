package com.pppp.raju;

public class PairOfFive {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
				if(arr[i]+arr[j]+arr[k]==5)
				{
					System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" ==5 ");
				}
				else if(arr[j]+arr[k]==5)
				{
					System.out.println(arr[j]+" + "+arr[k]+" ==5 ");
					
				}
				}
			 }
			break;
		}

	}

}
