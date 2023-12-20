package com.reimpliment.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentEntry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Student");
		try
		{
			int n=sc.nextInt();
			HashMap<Integer,String> hp=new HashMap<Integer,String>();
			
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter rollno and Name of Student");
				int rollno=sc.nextInt();
				String str=sc.next();
				hp.put(rollno, str);
			}
			System.out.println("Display data from map");
			for(Map.Entry e:hp.entrySet())
				System.out.println(e.getKey()+" "+e.getValue());
			{
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Only Integer Value");
		}
		
	}

}
