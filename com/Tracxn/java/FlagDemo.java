package com.Tracxn.java;
import java.util.Scanner;


public class FlagDemo {
		public static String function(String str,int flag)
		{
			
			String result="";
			if(flag==0)
			{
				for(int i=0;i<str.length();i=i+2)
				{
					result=result+str.charAt(i);
				}
			}
			else
			{
				for(int i=1;i<str.length();i=i+2)
				{
					result=result+str.charAt(i);
				}
			}
			return result;
		}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 0 or 1");
			int flag=sc.nextInt();
			String str="TRACXN";
			String result=function(str,flag);
			System.out.println(result);

		}

	}




