package com.TimePass.java;

public class StringRound {

	public static void main(String[] args) {
		String s="rajukumar";
		StringBuffer sb=new StringBuffer(s);
		String s1="";
		int count=-1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<sb.length();j++)
			{
				count++;
				if(count==3)
				{
					s1=s1+sb.charAt(j);
					sb.deleteCharAt(j);
					count=-1;
					j=j-1;
				}
				else if(sb.length()==1)
				{
					s1=s1+sb.charAt(j);
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(s1);

	}

}
