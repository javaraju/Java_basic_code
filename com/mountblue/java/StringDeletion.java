package com.mountblue.java;

import java.util.ArrayList;

public class StringDeletion {
	public static void main(String[] args) {
		String str="RAJUKUMAR";
		String temp="";
		StringBuffer sb=new StringBuffer(str);
		int count=-1;
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=0;j<sb.length();j++)
			{
				count++;
				if(count==3)
				{
					temp=temp+sb.charAt(j);
					sb.deleteCharAt(j);
					j=j-1;
					count=-1;
				}
				else if(sb.length()==1)
				{
					temp=(temp)+sb.charAt(j);
					sb.deleteCharAt(j);
					
				}
		    }
					
	    }
		System.out.println(temp);
		
	}
	
}
