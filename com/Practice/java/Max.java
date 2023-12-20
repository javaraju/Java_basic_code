package com.Practice.java;

public class Max {

	public static void main(String[] args) {
		int a[]= {1,6,5,4,10,6,4,1,2,5,9};
		int i=0;
		int n=a.length-1;
		int max=0;

		while(i<a.length/2)
		{
			if(a[i]>a[n])
			{
				if(max<a[i])	max=a[i];
			}
			else if(a[i]<a[n])
			{
				if(max<a[n])	max=a[n];
			}
			
			i++; n--;
		}
		if(a[i]>max)
			max=a[i];
		
		System.out.println(max);
	}

}
