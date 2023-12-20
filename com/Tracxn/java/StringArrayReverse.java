package com.Tracxn.java;

public class StringArrayReverse {
	public static String[] reverse(String[] s)
	{
		int i=0,j=s.length-1;
		while(i<j)
		{
			if(s[i]=="raju")
			{
				i++;
				
			}
			else if(s[j]=="raju")
			{
				j--;
			}
			else
			{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				i++;
				j--;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s[]= {"raju","a","b","raju","c","d","raju","e"};
		s=reverse(s);
		for(String a:s)
		{
			System.out.print(a+" ");
		}

	}

}
