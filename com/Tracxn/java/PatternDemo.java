package com.Tracxn.java;

public class PatternDemo {

	public static void main(String[] args) {
		int n=15;
		System.out.print(n+" ");
		while(n>1)
		{
			 if(n%2==1)
			{
				n=n*3+1;
			}
			else
			{
				n=n/2;
			}
			System.out.print(n+" ");
			
		}



	}

}
