package com.aaaa.java;

public class Stringsorting {

	public static void main(String[] args) {
		String str="rajukumarsoni";
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					 temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		/*str=String.valueOf(ch);
		System.out.println(str);*/
		for(char c:ch)
		{
			System.out.print(c);
		}
		

	}

}
