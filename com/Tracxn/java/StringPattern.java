package com.Tracxn.java;

public class StringPattern {

	public static void main(String[] args) {
		String s="goodmnrning";
		String p="g^dmnrning";
		int j=0;
		String re="";
		 int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==p.charAt(j))
			{
				j++;
				continue;
			}
			else if(s.charAt(i)!=p.charAt(j))
			{
				if(p.charAt(j+1)!=s.charAt(i))
				{
					re=re+s.charAt(i);
				}
				else
				{
					
				   while(count<re.length())
				   {
					   count++;
					   
				   }
				   int flag=0;
				   for(int k=1;k<=count/2;k++)
				   {
					  if(count%k==0)
					  {
						  flag++;
					  }
				   }
				   if(flag==1)
				   {
					   System.out.println(1);
				   }
				   
				   else
				   {
					   System.out.println(0);
				   }
				   
				   
				}
			}
			
		}

	}

}
