package com.huawei.test;
import java.util.*;
public class MostRepeatedChar {

	public static void main(String[] args) {
		String str="rajukumarranjitarani";
		char []arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
		int count=1;
		int temp=0;
		char alp='0';
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i])
			{
				count++;
			}
			else
			{
				if(count>temp)
				{
					temp = count;
					alp=arr[i-1];
				}
				count=1;
			}
		}
		
		if(count>temp)
		{
	        System.out.println(count+" "+arr[arr.length-1]);
		}
		else
		{
			System.out.println(temp+" "+alp);
		}
	}

}
