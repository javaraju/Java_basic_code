package com.aaaa.java;

import java.util.Scanner;

public class AlphabetChekDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a Character");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Given no is character");
		}
		else
		{
			System.out.println("Given No is Not Character!");
		}
				
			
		



	}

}
