package com.AppsPatern.java;

public class Pattern41 {

	public static void main(String[] args) {
		int n=5;
		int m=n*2-1;
		int h=n/2*2;
		char k='A';
		int b=0;
		char a;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				a=k;
				if(j>=n+1-i&&j<=h+i)
				{
					char s=(char) (a-b);
			       System.out.print(s);
			       b++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			b=0;
			k+=2;
			System.out.println();
		}
	}

}
