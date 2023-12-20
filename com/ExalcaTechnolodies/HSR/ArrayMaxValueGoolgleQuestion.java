package com.ExalcaTechnolodies.HSR;

public class ArrayMaxValueGoolgleQuestion {

	public static void main(String[] args) {
		int arr[]= {10,5,6,7,9,8};
		for(int i=0;i<arr.length;i++)
		{
			if(i+2>=arr.length)
			{
				break;
			}
			else
			{
				int max=arr[i];
			   for(int j=i;j<=i+2;j++)
			     {
				    if(arr[j]>max)
				    {
				    	max=arr[j];
				    }
			     }
			   System.out.println(max);
			   max=0;
			}
		}

	}

}
