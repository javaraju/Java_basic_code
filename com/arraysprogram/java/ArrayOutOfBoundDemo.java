package com.arraysprogram.java;

public class ArrayOutOfBoundDemo {

	public static void main(String[] args) {
		int arr[]=new int[2];
		arr[0]=5;
		arr[1]=4;
		
		for(int i=0;i<=arr.length;i++) {
			System.out.println("Arrays are " +i+" = "+arr[i]);
		}
		

	}

}
