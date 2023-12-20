package com.importantcode.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {

	public static void main(String[] args) throws NumberFormatException, IOException  {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a Number");
Integer n=Integer.parseInt(br.readLine());
String str=String.valueOf(n);
String reverse="";
/*for(int i=str.length()-1;i>=0;i--)
{
	reverse=reverse+str.charAt(i);
}*/
for(int i=0;i<str.length();i++) {
	reverse=str.charAt(i)+reverse;
}

System.out.println(reverse);
//System.out.println(Integer.valueOf(reverse.toString()));
//System.out.println(Integer.valueOf(reverse));
	}

}
