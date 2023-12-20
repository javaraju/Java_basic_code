package com.ExalcaTechnolodies.HSR;

import java.util.Arrays;

public class ReverseStrinngWithoutDisturbSpecialChar {
	public static char[] reverseString(char[] arr)
	{
		
		
		int r=arr.length-1,l=0;
		while(l<r)
		{
		if(arr[l]<65&&arr[l]>90&&arr[l]<97&&arr[l]>122)
			//or if(!Character.isAlphabetic(arr[l])
		{
			l++;
		}
		else if(arr[r]<65&&arr[r]>90&&arr[r]<97&&arr[r]>122)
			//or if(!Character.isAlphabetic(arr[r])
		{
			r--;
		}
		else
		{
			char temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		String str="ra!!@@ju##ku*m||ar";
		char arr[]=str.toCharArray();
		arr=reverseString(arr);
		String s=new String(arr);
		System.out.println(s);

	}
	

}
