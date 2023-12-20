package com.Apps.Raju;

public class SupperDigit {
	public static int fun(int s)
	{
		int re,sum=0;
		while(s>0)
		{
			re=s%10;
			s=s/10;
			sum=sum+re;
			
		}
		if(sum/10==0)
		return sum;
		return fun(sum);
		
	}

	public static void main(String[] args) {
		int n=9875;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
			
		}
		int result=fun(sum);
		System.out.println(result);

	}

}
