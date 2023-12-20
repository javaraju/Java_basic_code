package com.arraysprogram.java;
import java.util.*;
public class MultidimentionalArrayDemo {

	public static void main(String[] args) {
		int arr[][]= {{2,2,3},{8,5,6},{7,5,6}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println("\t");
		}
	

	}

}
