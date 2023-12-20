package com.mountblue.java;

import java.util.Arrays;

public class CrossX {

	public static void main(String[] args) {

int n=6;
int arr[][]=new int[n][n];
int r=4,c=4;
//arr[r-1][c-1]=1;
int a,b;
a=r-1;b=c-1;
while(b>=0&&a<n)
{
	arr[a][b]=1;
	a++;b--;
}
a=r-1;b=c-1;
while(a<n&&b<n)
{
	arr[a][b]=1;
	a++;b++;
}
a=r-1;b=c-1;
while(a>=0&&b>=0)
{
	arr[a][b]=1;
	a--;b--;
}a=r-1;b=c-1;
while(a>=0&&b<n)
{
	arr[a][b]=1;
	a--;b++;
}
for(int[]k:arr)
{
	System.out.println(Arrays.toString(k));
}

	}

}
