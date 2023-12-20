package com.importantcode.java;

import java.util.Arrays;
import java.util.Collections;
public class ArrayAcsendingAndDecs {

	public static void main(String[] args) {
		String ch[]= {"a","d","z","b","c"};
		System.out.println(" Array in Normal:-");
		for(String c:ch)
		{
			System.out.println(" "+c);
		}
		Arrays.sort(ch);
		System.out.println("Array in Ascending Order:-");
		for(String c:ch)
		{
			System.out.println(" "+c);
		}
		//Arrays.sort(ch,Collections.reverseOrder());
		//System.out.println("Array in Descending Order:-");
		for(String c:ch)
		{
			//System.out.println(" "+c);
		}
		System.out.println("another methods for descending ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
