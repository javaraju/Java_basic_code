package com.Practi222.java;

public class ArmstrongNo {
	static int fun(int r,int no)
	{
		int sum=1;
		while(no!=0)
		{
			sum=sum*r;
			no--;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=5474;
		String s=String.valueOf(n);
		int no=s.length();
		int t=n;
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+fun(r,no);
		}
		if(t==sum)
		{
			System.out.println("No is Armstrong No.");
		}
		else
		{
			System.out.println("NOt Armstrong no");
		}

	}

}
