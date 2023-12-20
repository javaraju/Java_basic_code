package com.Practice.java;

public class TestDemo {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i%15==0)
			{
				System.out.print("Fifteen"+" ");
			}
			else if(i%5==0)
			{
				System.out.print("five"+" ");
			}
			else if(i%3==0)
			{
				System.out.print("three"+" ");
			}
			else
				System.out.print(i+" ");
		}

	}

}
