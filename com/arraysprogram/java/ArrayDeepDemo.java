package com.arraysprogram.java;

import java.util.Arrays;

public class ArrayDeepDemo {

	public static void main(String[] args) {
		int arr[]= {9,5,8};
		int arr1[]= {9,5,8};
		Object arro[]= {arr};
		Object arro1[]= {arr1};
		//if(Arrays.deepEquals(arro,arro1))
		if(Arrays.equals(arr, arr1))
			System.out.println("same");
		else
			System.out.println("Not same");
			

	}

}
