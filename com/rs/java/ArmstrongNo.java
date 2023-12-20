package com.rs.java;

public class ArmstrongNo {
	public static int result(int r,int len)
	{
		int b=1;
		while(len>0)
		{
			b=b*r;
			len--;
		}
		return b;
	}

	public static void main(String[] args) {
		int n=54748;
		String s=String.valueOf(n);
		int len=s.length();
		int temp=n;
		int r=0,sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+result(r,len);
		}
		System.out.println(sum);
	    if(temp==sum)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("no is not Armstrong no");
		}
		
	

	}

}
