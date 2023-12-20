package com.importantcode.java;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		//String s="Ranjita";
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		//char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		//for(char ch:a)
			
		{
			Character ch=s.charAt(i);
			if(!set.contains(ch))
			{
				
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
		//System.out.println(sb);
		
		{
			
		}

	}

}
