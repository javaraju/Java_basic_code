package com.Recurtion.java;

public class GreatestCommonDivisor {
	public static int GCD(int a,int b)
	{
		if(a==b)
		{
			return a;
		}
		else if(a%b==0)
		{
			return b;
		}
		else if(b%a==0)
		{
			return a;
		}
		else if(a>b)
		{
			return(GCD(a%b,b));
		}
		else
		{
			return(GCD(a,b%a));
		}
	}

	public static void main(String[] args) {
		int a=105;
		int b=91;
		int result=GCD(a,b);
		System.out.println("Greatest Common Divisor of"
				+ " "+a+" and "+b+" is: "+result);

	}

}
