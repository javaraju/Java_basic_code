package com.huawei.test;

import java.util.HashSet;
import java.util.Set;

public class NoreapeatinChar {

	public static void main(String[] args) {
		String s="javajstrsv";
		Set st=new HashSet();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				char ch=s.charAt(i);
				if(!st.contains(ch))
				{
					st.add(ch);
					sb.append(ch);
				}
			}
		}
		System.out.println(sb.toString());
	}

}
