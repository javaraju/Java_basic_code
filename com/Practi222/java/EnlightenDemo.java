package com.Practi222.java;

public class EnlightenDemo {
	static int m1(int n )
	{
		
		try 
		{
			n=n/0;
			return n;
		}
		catch(ArithmeticException e)
		{
			n=n/2;
			return n;
			
		}
		finally
		{
			n=n/5;
			return n;
		}
	}

	public static void main(String[] args) {
		EnlightenDemo e= new EnlightenDemo();
		int m=10;
		System.out.println(m1(m)+" ");



	}

}
