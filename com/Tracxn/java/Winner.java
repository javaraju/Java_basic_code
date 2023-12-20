package com.Tracxn.java;

public class Winner {

	public static void main(String[] args) {
	String s="rajukumar";
	String sub="ar";
	int k=0;
	int flag = 0;
	for(int i=0;i<s.length();i++)
	{
    if(k < sub.length() && s.charAt(i)==sub.charAt(k))
		{
			k++;
		}
		else
		{
			k=0;
		}
		if(k==sub.length())
		{
			System.out.println("Yes");
			flag = 1;
			break;
		}

		
	}
	if(flag == 0)
	{
		System.out.println("no");
	}
  }

}
