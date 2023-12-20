package com.mountblue.java;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalanceWithSwitch {
	static boolean isBracketBalanced(String s)
	{
		Stack<Character> ss=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='{'||c=='['||c=='(')
			{
				ss.push(c);
			}
			else if(c=='}'||c==']'||c==')')
			{
			    if(ss.empty())
					return false;
				switch(c)
				{
				case'}':
				
					if(ss.pop()!='{')
					
						return false;
						break;
				case']':
					if(ss.pop()!='[')
						return false;
					break;
				case')':
					if(ss.pop()!='(')
						return false;
					break;
					default:
						break;
				}
			}
			
		}
		if(ss.empty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value:");
		String s=sc.nextLine();
		boolean b=isBracketBalanced(s);
		System.out.println("Is Bracket Balanced:- "+b);
				
		

	}

}
