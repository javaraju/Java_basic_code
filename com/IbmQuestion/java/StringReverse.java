package com.IbmQuestion.java;

public class StringReverse {

	public static void main(String[] args) {
		String original="Ranjita";
		String reverse="";
		System.out.println("Before reverse:- "+original);
		for(int i=0;i<original.length();i++)
		{
			reverse=original.charAt(i)+reverse;
		}
		System.out.println("After reverse:- "+reverse);



	}

}
