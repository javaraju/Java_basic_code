package com.AparPeapleWorld.java;

public class StringReverse1 {

	public static void main(String[] args) {
		String s="Hello World";
		String[] st=s.split(" ");
		String ch="";
		
		for(int i=0;i<st.length;i++)
		{
			String stu=st[i];
			String res="";
			
				for(int j=0;j<stu.length();j++)
				{
					res=stu.charAt(j)+res;
				}
				ch=ch+res+" ";
		}
		System.out.println(ch);

	}

}
