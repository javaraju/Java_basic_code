package com.mycoding.java;

public class CircularPrime {
	//Method to check given no is Circular prime or not........
	public static boolean isCircular(int n)
	{
		int temp=n;
		int count=0;
		do {
			System.out.println(temp);
		      if(isPrime(temp)==false)
		         {
			        count++;
			        break;
		         }
		      temp=circulate(temp);
		}
		while(temp!=n);
		if(count==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	//Method to check the Prime Number or not......
	public static boolean isPrime(int t)
	{
		int count=0;
		for(int i=1;i<=t/2;i++)
		{
			if(t%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Method For circulate the number...... 
	static int circulate(int m)
	{
		String s=Integer.toString(m);
		String st=s.substring(1)+s.charAt(0);
		int result=Integer.parseInt(st);
		return result;
	}
	//Main Method.......
	public static void main(String[] args) {
		int n=113;
		boolean b=isCircular(n);
		if(b==true)
		{
			System.out.println(n+" Is Circular Prime.");
		}
		else
		{
			System.out.println(n+" Is Not a Circular Prime.");
		}
		
	}
	
		

}
