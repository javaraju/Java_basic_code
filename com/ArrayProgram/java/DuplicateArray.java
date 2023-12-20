package com.ArrayProgram.java;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,2,5,44,77,55,88,2,99,6,5};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if((array[i]==array[j]))
				{
					System.out.println(array[j]);
					
				}
			}
		}
	}

}
