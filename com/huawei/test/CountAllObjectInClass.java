package com.huawei.test;

public class CountAllObjectInClass 
{
	static int count=0;
	static int Number=0;
	//First Way by using constructor----
	CountAllObjectInClass()
	{
		count++;
	}
	//Second way by using instance block-----
	{
		Number++;
	}
	

	public static void main(String[] args)
	{
		CountAllObjectInClass m=new CountAllObjectInClass();
		CountAllObjectInClass m1=new CountAllObjectInClass();
		CountAllObjectInClass m2=new CountAllObjectInClass();
		CountAllObjectInClass m3=new CountAllObjectInClass();
		CountAllObjectInClass m4=new CountAllObjectInClass();
		
		System.out.println("Total Number Of Method is: "+count);
		System.out.println("Total Number Of Method is: "+Number);
		
	}

}
