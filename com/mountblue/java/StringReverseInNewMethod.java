package com.mountblue.java;

public class StringReverseInNewMethod {

	public static void main(String[] args) {

String str="Raju Kumar Soni";
String s1="";
String s2="";
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)!=' ')
	{
		s1=s1+str.charAt(i);
	}
	else
	{	
		s2=s1+" "+s2;
		s1="";
	}
}
System.out.println(s1+" "+s2);
	}


}
