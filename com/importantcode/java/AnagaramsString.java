package com.importantcode.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagaramsString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two String For Checking Anagrams:");
        String str=sc.nextLine();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char[] arr1=str.toCharArray();
		char[] arr2=str1.toCharArray();
		char[] arr3=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		if(Arrays.equals(arr1,arr2))
		{
			if(Arrays.equals(arr2,arr3))
			{
				System.out.println(" All String are Anagrams.");
			}
			else
			{
				System.out.println("Only two are Anagram.");
			}
			
		}
		else
		{
			System.out.println("non of the anagram");
		}
		
		

	}

}
