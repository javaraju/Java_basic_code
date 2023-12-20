package com.Practice.java;

public class StringReverseWighoutSplitMethod {

public static void main(String[] args) {
	String s="Raju kumar soni";
	String s1="";
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			s1=s1+s.charAt(i);
		}
		else
		{
			s2=s1+" "+s2;
			s1="";
		}
		
		
}
	System.out.print(s1+" "+s2);
	
}
	
}

	