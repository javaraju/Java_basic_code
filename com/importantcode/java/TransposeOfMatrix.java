package com.importantcode.java;
import java.util.Scanner;
public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column of a matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int array[][]=new int[r][c];
		System.out.println("Enter the Element of an Matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("Normal matrix is:-");
		/*for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();*/
		for(int[] x1:array)
		{
			for(int x2:x1)
			{
				System.out.print(x2+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of Matrix:-");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}

}
