package com.importantcode.java;

public class HHH {
	static String s2="";
	
	static String spo(String s)
{ String s3="";
	for(int i=0;i<s.length();i++)
	{
		if((i+1)%4==0)
			{s2=s2+s.charAt(i);}
		else
			s3=s3+s.charAt(i);
	}
	
	if(s3.length()<4) return s2;
	else return spo(s3);
}

	public static void main(String[] args) {
		
		
		String s="ABCDEFGHIJKLM";
		
	System.out.println(spo(s));	
	}
	
}
