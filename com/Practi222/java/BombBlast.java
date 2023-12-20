package com.Practi222.java;

import java.util.Arrays;

public class BombBlast {

	public static void main(String[] args) {
		String[][] s= {
				{"0","X","X","0"},
				{"X","0","X","X"},
				{"X","0","0","X"},
				{"0","X","0","X"}
				};
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i][j]=="X")
				{
					for(int m=i-1;m<=i+1&&m<s.length;m++)
					{
						if(m<0)
						{
							continue;
						}
						for(int n=j-1;n<=j+1&&n<s.length;n++)
						{
							if(n<0)
							{
								continue;
							}
							if(s[m][n]=="0")
							{
								count++;
							}
						}
					}
				}
				if(count>0)
				{
					s[i][j]=String.valueOf(count);
					count=0;
				}
				
			}
		}
		for(String[] c:s)
		{
			System.out.println(Arrays.toString(c));
		}
		

	}

}
