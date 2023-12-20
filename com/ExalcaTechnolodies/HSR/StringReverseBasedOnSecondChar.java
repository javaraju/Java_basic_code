package com.ExalcaTechnolodies.HSR;
public class StringReverseBasedOnSecondChar {

	public static void main(String[] args) {
		String s="Success consists of incremental effort without losing enthusiasm";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[1]>96&&arr[1]<123)
			{
				arr[1]=(char)(arr[1]-32);
			}
			
			else if(arr[i]==' ')
			{
				arr[i+2]=(char)(arr[i+2]-32);
			}
		}
		
		String sre[]=new String[7];
		String str="";
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				str=(str+arr[i]);
			}
			else
			{
				
				sre[k++]=str;
				str="";
			}
		}
		
		for(int i=1;i<sre.length;i++)
		{
				if(sre[i-1].charAt(1)>sre[i].charAt(1))
				  {
					String temp=sre[i];
					sre[i]=sre[i-1];
					sre[i-1]=temp;
					i=0;
				  }
		}
		for(int i=0;i<sre.length;i++)
		{
			System.out.print(sre[i]+" ");
		}
	}

}
