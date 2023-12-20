package com.ArrayProgram.java;

import java.util.Arrays;

public class SortingArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[]={5,2,9,1,-5,-8,10,66,33,99,44};
		  String str[]={"raju","shyam","ramjita","ambuj","alekhya",
		  "dhanu","rani","kanchan","nishi"};
		  System.out.println("Original Array are:-\n "+Arrays.toString(array));
		  System.out.println("Original Array In Second Style:-");

		  for(int arr:array)
		  {
			  System.out.print(arr+" ");
		  }
		  System.out.println();
		  System.out.println("Original String Array:-\n "+Arrays.toString(str));
		  System.out.println("Original String Array in Second Style:- ");
		  for(String st:str)
		  {
			System.out.print(st+", ");  
		  }
		  System.out.println();
		  Arrays.sort(array);
		  System.out.println("After sorting an array:-\n "+Arrays.toString(array));
		  Arrays.sort(str);
		  System.out.println();
		  System.out.println("After sorting a String Array:-\n "+Arrays.toString(str));
		  int smallest;
		  for(int i=0;i<array.length;i++)
		  {
			  //smallest=array[i];
		  for(int j=i+1;j<array.length;j++)
		  {
			 // if(smallest>array[j])
			 if(array[i]>array[j])
			 {
			smallest=array[i];
			 array[i]=array[j];
			 array[j]=smallest;
			 }
		  }
		  }
		  System.out.println();
		  System.out.println("After sorting of Array:-\n "+Arrays.toString(array));
		 
		 

	}

}
