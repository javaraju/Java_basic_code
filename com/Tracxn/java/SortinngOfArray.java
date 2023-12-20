package com.Tracxn.java;

public class SortinngOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,7,11,4,3,9,2,88,6};
		for(int i=1;i<a.length;i++)
		{
		if(a[i]<a[i-1])
		{
			a[i]=a[i-1]+(a[i-1]=a[i])-a[i-1];
			i=0;
		}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "); 
		}
	}

}
