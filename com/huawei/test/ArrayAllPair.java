package com.huawei.test;

public class ArrayAllPair {
	public static void fun(char []ch,int n)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				//System.out.println(ch[j]);
			}
		}
	}

	public static void main(String[] args) {
		char ch[]= {'a','b','c'};
		int n=ch.length;
		fun(ch,n);

	}
}
//o/p:-
//a,b,c,ab,ac,bc,abc
