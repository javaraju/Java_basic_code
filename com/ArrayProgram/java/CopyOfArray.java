package com.ArrayProgram.java;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args)
	{
		
		        int array[] = {55,88,99,33,11,44,74,14,12,55};
		        
		        /*int copyArray[] = new int[array.length];
		        
		        System.arraycopy(array, 0, copyArray, 0, array.length);
		        
		        System.out.println(Arrays.toString(copyArray));*/
		        
		        
		        int newArray[]=new int[10];
		        
				System.out.println("Element of an array is:-\n "
						+Arrays.toString(array));
				
				for(int i=0;i<array.length;i++)
				{
					newArray[i]=array[i];
				}
				
				System.out.println("Element copy Array to new Array:-");
				
				for(int arr:newArray)
				{
					System.out.println(" "+arr);
				}

	}

}
