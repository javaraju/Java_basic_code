package com.Apps.Raju;

public class Pallindrom {

	public static void main(String[] args) {
		String str="radar";//
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			str1=str.charAt(i)+str1;
		}
		System.out.println(str1);
		if(str.equals(str1))
		{
			System.out.println("Given String is Pallindrom.");
		}
		else
			System.out.println("Given String is Not pallindrom.");
		



	}

}
