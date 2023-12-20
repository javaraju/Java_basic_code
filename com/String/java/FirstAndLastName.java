package com.String.java;

public class FirstAndLastName {
	
	public static String convertName(String s)
	{
	    String lastname ="";
	    String firstname ="";
	    for(int i=0; i<s.length(); i++)
	     {
	        if(s.charAt(i)==' ')
	        {
	            lastname = s.substring(i+1);
	            firstname =s.substring(0,i);
	        }
	     }
	
	    return (lastname+ ", " +firstname);
		
	}
	public static void main(String[] args) {
		String s="Raju Kumar";
		String s1=convertName(s);
		System.out.println(s1);
		
	}

}
