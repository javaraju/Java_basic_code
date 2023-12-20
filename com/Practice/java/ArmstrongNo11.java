package com.Practice.java;
import java.util.Scanner;
public class ArmstrongNo11 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entar Number");
		int n=sc.nextInt();
		int r,sum=0,temp=n;
		String s=n+"";
		int No=s.length();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+result(r,No);

			
		}
		if(sum==temp)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");



	}
	public static int result(int r,int No)
	{
		int b=1;
		while(No>0)
		{
			b=b*r;
			No--;
		}
		return b;
		
	}

}


