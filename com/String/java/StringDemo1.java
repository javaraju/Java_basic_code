package com.String.java;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="rajukrumkaruk";
		String s="";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(!s.contains(ch[i]+""))
				{
				if(ch[i]==ch[j])
				{
					count++;
					break;
				}
				
				}
			}
			if(count==1)
			{
				s=s+" "+ch[i];
				count=0;
				
			}
			
		}
		System.out.println(s);
		
	}
}
