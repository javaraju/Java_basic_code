package com.Tracxn.java;

import java.util.Arrays;

public class SpaceRemove {

	public static void main(String[] args) {
		String s="Raj  u ku  mar so ni";
		System.out.println(s);
		//String result=s.replaceAll("\\s","");
		//String resut=s.replaceAll(" ","");
		//System.out.println(resut);
		//char[] ss=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')//&&ss[i]!='\t')
			{
				sb.append(s.charAt(i));
			}
		}
		String result=sb.toString();
		System.out.println(result);
		
		
		
		

	}

}
