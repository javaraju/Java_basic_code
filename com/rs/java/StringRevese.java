package com.rs.java;

public class StringRevese {
    /* static String reverse(String s1)
	{
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		return (sb.toString());
		
	}*/

	public static void main(String[] args) {
		String s="RAJUKUMARso123";
		String s1="";
		for(int i=0;i<s.length();i+=3)
		{
			if(i+2<=s.length()-1)
			{
				s1=s1+s.charAt(i+2)+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+2<=s.length())
			{
				s1=s1+s.charAt(i+1)+s.charAt(i);
			}
			else if(i+1<=s.length())
			{
				s1=s1+s.charAt(i);
			}
			
			
			
		}
		System.out.println(s1);



	}

}
