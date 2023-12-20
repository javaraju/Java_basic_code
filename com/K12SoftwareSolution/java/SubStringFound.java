package com.K12SoftwareSolution.java;

public class SubStringFound {

	public static void main(String[] args) {
		String s="constant";
		String f="tant";
		int i=f.length()-1;
		int flag=0;
		
			for(int j=s.length()-1;j>=0;j--)
			{
				if(i<0)
				{
					break;
				}
				else if(f.charAt(i)==s.charAt(j))
				{
					i--;
					flag++;
				}
				else
				{
					
					break;
				}
			}
			
		if(flag==f.length())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
