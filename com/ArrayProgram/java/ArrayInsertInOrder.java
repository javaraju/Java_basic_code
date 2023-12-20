package com.ArrayProgram.java;

import java.util.Arrays;

public class ArrayInsertInOrder {
	static int[] inOrder(int[] m,int[] n)
	{
		 int arr[]=new int[m.length+n.length];
		 int i=0,j=0,k=0;
		 while(i<m.length&&j<n.length)
		 {
			 if(m[i]>n[j])
			 {
				 arr[k++]=n[j++];
			 }
			 else
			 {
				 arr[k++]=m[i++];
			 }
		 }
		 while(i<m.length)
		 {
			 arr[k++]=m[i++];
		 }
		 while(j<n.length)
		 {
			 arr[k++]=n[j++];
		 }
		 return arr;
	       
	}

	public static void main(String[] args) {
		int m[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
		for(int i=1;i<m.length;i++)
		{
			if(m[i]<m[i-1])
			{
			m[i]=m[i-1]+(m[i-1]=m[i])-m[i];
			i=0;
			}
			
		}
        int N[] = {5, 7, 9, 25};
        int arr[]=inOrder(m,N);
        System.out.println(Arrays.toString(arr));
       
	}

}
