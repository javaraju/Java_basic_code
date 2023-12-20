package com.importantcode.java;

import java.util.Arrays;

public class CommonArray {

	public static void main(String[] args) {
		int a[]= {2,5,4,6,9,8,7};
		int b[]= {1,10,11,4,9,8,15,55};
		//Arrays.sort(a);
		//Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		

	}

}
