package com.mountblue.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryConversion {

	public static void main(String[] args) {
		int  n=222;
		int count=0;
		String s=Integer.toBinaryString(n);
		Pattern p=Pattern.compile("1");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			++count;
			
		}
		m=p.matcher(s);
		System.out.println(s);
		System.out.println(count);
		while(m.find())
		{
			System.out.println(m.start()+1);
		}
		

	}

}
