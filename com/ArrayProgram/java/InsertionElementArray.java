package com.ArrayProgram.java;

import java.util.Arrays;

public class InsertionElementArray {

	public static void main(String[] args) {
		
		int array[]= {44,55,88,11,22,33,66,99,77};
		System.out.println("Before Exchanging element:- ");
		for(int arr:array)
		{
			System.out.println(" "+arr);
		}
		int indexNumber=2;
		int element=100;
		for(int i=array.length-1;i>2;i--)
		{
			array[i]=array[i-1];
		}
		array[indexNumber]=element;
		System.out.println("After Adding:- ");
       for(int a:array) {
			System.out.println(a);
		}

	}

}
