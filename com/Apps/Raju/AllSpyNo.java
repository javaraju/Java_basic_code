package com.Apps.Raju;

import java.util.Scanner;

public class AllSpyNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a range of  Number:-");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int r,re;
		int sum,mul;
		int cn,cn1;
	for(int i=n;i<=m;i++)
	{
		sum=0;
		mul=1;
		cn=cn1=i;
		
		while(cn>0)
		{
			r=cn%10;
			cn=cn/10;
			sum=sum+r;
		}
		
		while(cn1>0)
		{
			re=cn1%10;
			cn1=cn1/10;
			mul=mul*re;
		}
		if(sum==mul)
		{
			System.out.println(i+" :sum= "+sum+" , mul= "+mul);
		}
	}
		

	}

}
