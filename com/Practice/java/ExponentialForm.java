package com.Practice.java;

import java.util.Scanner;

public class ExponentialForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter float Value");
		float n=scan.nextFloat();
		String s=""+n;
		char ch[]=s.toCharArray();
		int count=0;
		boolean flag=false;
		for(int i=0;i<ch.length;i++)
		{
			
			if((ch[i]!='.'))
			{
				
				if(ch[i]!='0')
				{
			    System.out.print(ch[i]);
			
				}
				else
				{
					count++;
				}
				
			}
			else
			{flag=true;
				count++;
			}
			
		}
		
		if(flag) System.out.print("x10^(-"+count+")");
		else System.out.print("x10^"+count);

	}

}
