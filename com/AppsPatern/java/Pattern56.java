package com.AppsPatern.java;

public class Pattern56 {
	public static void main(String[] args) {
		int  size=5;
		int i;
		int j;
		for(i=size;i>=-size;i--)
		{
			for(j=Math.abs(i);j<=size;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}


}
