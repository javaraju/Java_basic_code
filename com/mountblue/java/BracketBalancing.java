package com.mountblue.java;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalancing {
	static boolean isBracketIsBalance(char[] s)
	{
		boolean flag=true;
		Stack<Character> st=new Stack<Character>();
		
		    for(int i=0;i<s.length;i++)
		       {
			     if(s[i]=='{'||s[i]=='['||s[i]=='(')
			       {
				     st.push(s[i]);
			       }
			     else if(s.length%2==1)
					{
						flag=false;
						break;
					}
			     else if(s[i]=='}')
			       {
				     if(st.pop()!='{')
				       {
				    	 flag= false;
					      break;
				       }
				    
			       }
			     else if(s[i]==']')
			       {
				     if(st.pop()!='[')
				       {
				    	 flag= false;
					     break;
				       }
			       }
			     else if(s[i]==')')
			       {
				     if(st.pop()!='(')
				       {
				    	 flag= false;
					     break;
				       }
				     
			       }
		      }
		
	     
		   if(flag==true)
		      {
			    return true;
		      }
		   else
		      {
			    return false;
		      }  
     }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		boolean b=isBracketIsBalance(ch);
		System.out.println("Is bracket Is Balanced:- "+b);

	}

}
