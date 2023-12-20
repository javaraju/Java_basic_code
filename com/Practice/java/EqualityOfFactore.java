package com.Practice.java;

public class EqualityOfFactore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=714;
		int m=715;
		int[] a =new int[23];
		int c=0;
		for(int i=1;i<=n||i<=m;i++)
		{
			if(n%i==0||m%i==0)
			{
                
                a[c++]=i;
               


			}
		}
		for(int l:a)
		System.out.println(l);
		for(int i=0;i<a.length;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				
			}
		}
		
		/*int b=n*m;
		for(int j=1;j<=b;j++)
		{
			if(b%j==0)
			{
				
			}
		}*/
		
		

	}

}
