package com.TimePass.java;

import java.util.Arrays;
import java.util.Stack;

public class BomBlast {
	static boolean bracketBalance(String s)
	{
		
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			if(c=='{'||c=='('||c=='[')
			{
				st.push(c);
			}
			else if(c=='}'||c==')'||c==']')
			{

				if(st.empty())
				{
					return false;
					
				}
				else{
					switch(c) {
					case'}':
						if(st.pop()!='{')
						
							return false;
							break;
						
					case')':
						if(st.pop()!='(')
						
							return false;
							break;
						
					case']':
						if(st.pop()!='[')
						
						    return false;
							break;
						
						default:
							break;
					}
				}
			}
			
		}
		if(st.empty())
			return true;
			return false;
		
	}
	
	public static void main(String[] args) {
		String s="{{))}}";
		boolean b=bracketBalance(s);
		System.out.println("Is bracket balance?--> "+b);
	}
		
}
