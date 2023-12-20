package com.TimePass.java;
import java.util.Stack;
public class BracketBalancing {

	public static void main(String[] args) {
		String str="{[(({}))]}()";
		boolean b=balance(str);
		
			System.out.println(b);
	}
	public static boolean balance(String str)
	{
	    Stack<Character> s=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='{'||c=='('||c=='[')
			{
				s.push(c);
			}
			else if(c=='}'||c==')'||c==']')
			{
				 if(s.empty())
						return false;
				
				switch(c)
				{
				case'}':
					if(s.pop()!='{')
					
					    return false;
					    break;
				case')':
					if(s.pop()!='(')
						return false;
					    break;
				case']':
					if(s.pop()!='[')
						return false;
					    break;
					    default:
					    	break;
				}
			}
		}
		if(s.empty())
			return true;
		return false;

	}

}
