
package com.Apps.Raju;

import java.util.Scanner;

public class AllAutomorphicNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a range of  Number:-");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int cn,num;
		int sq;
		int r,t;
	    boolean b;
		for(int i=n;i<=m;i++)
		{    cn=i;
		     num=i;
		     sq=cn*cn;
		     t=10;
		     b=false;
			while(cn>0)
			{
				r=sq%t;
				cn=cn/10;
				t=t*10;
				if(num==r)
				{
					b=true;
					break;
				}
			}
			if(b)
			{
				System.out.println(num+":"+sq);
			}
		}

	}

}
