package com.ExalcaTechnolodies.HSR;

public class Vowelscount {

	public static void main(String[] args) {
		//String str="Succeses consists of incremental"
				//+ " effort without using enthusiasm";
		String str="without";
		String indexes="";
		String vowels="";
		int j=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1)=='a'||str.charAt(i-1)=='e'||str.charAt(i-1)=='i'
					||str.charAt(i-1)=='o'||str.charAt(i-1)=='u')
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
						||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					j++;
					if(j==1)
					{
						indexes+=i+","+(i+1);
						vowels=""+str.charAt(i-1)+str.charAt(i);
					}
					else
					{
						indexes+=","+(i+1);
						vowels+=str.charAt(i);
					}
				}
			}
		}
		System.out.println(vowels+ " = " +indexes);

	}

}
