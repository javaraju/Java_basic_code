	package com.Tracxn.java;

import java.util.Arrays;

public class StringPrifix {
	
		public static void main(String[] args) {
			String s[]= {"Rajendra","Raju","Rajnish"};
			int minCount=s[0].length();
			String min=s[0];
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()<minCount)
				{
					min=s[i];
					minCount=s[i].length();
				}
				
			}
			Arrays.sort(s);
			int i=0;
			int flag = 0;
			while(i<min.length())
			{
				flag = 0;
				for(int j=1;j<s.length;j++)
				{
					if(min.charAt(i) != s[j].charAt(i))
					{
						flag = 1;
						break;
					}
				}
				if(flag == 1)
				{
					break;
				}
				i++;
				}
			
			System.out.println(min.substring(0,i));
			
			
		}
	
	}
