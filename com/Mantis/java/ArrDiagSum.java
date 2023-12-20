package com.Mantis.java;

public class ArrDiagSum {

	public static void main(String[] args) {
		int array[][]= {{1,5,8},
				        {2,4,9},
				        {10,3,1}};
		int total = 0;

	    for (int row = 0; row < array.length; row++)
	    {
	        for (int col = 0; col <array.length; col++)
	            total+=array[row][col];
	    }

	    System.out.println(total);
	



	}

}
