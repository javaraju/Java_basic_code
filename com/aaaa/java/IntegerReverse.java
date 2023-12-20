package com.aaaa.java;

public class IntegerReverse {

	public static void main(String[] args) {
		int n=123;
		int r,sum=0;
		while(n!=0)
		{
			/*System.out.print(n%10);
			n=n/10;*/
			r=n%10;
			n=n/10;
			sum=sum*10+r;
			
		}
		System.out.println(sum);

	}

}
