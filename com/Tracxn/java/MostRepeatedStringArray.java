package com.Tracxn.java;

public class MostRepeatedStringArray {

	public static void main(String[] args) {
		String str[]= {"raju","ranjita","ragni","raju","ragni","ranjita","ranjita"};
		String result=null;
		int no=1;
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					count++;
				}
			}
			if(count>no)
			{
				no=count;
				result=str[i];
			}
		}
		System.out.println(no+" "+result);

	}

}
