package com.Recurtion.java;

public class TowerOfHanoi {
	static void toh(int n,char beg,char aux,char end)
	{
		if(n>=1)
		{
			toh(n-1,beg,end,aux);
			System.out.println(beg+" "+end);
			toh(n-1,aux,beg,end);
		}
	}

	public static void main(String[] args) {
		int n=3;
		char beg='A';
		char aux='B';
		char end='C';
		toh(n,beg,aux,end);

	}

}
