package com.mountblue.java;

import java.util.Arrays;

public class BombBlast {

	public static void main(String[] args)
	{
		String arr[][]={{"0","X","0","X","0"},
				        {"X","0","X","0","0"},
				        {"0","X","0","X","X"},
				        {"X","X","0","X","X"},
				        {"0","X","0","0","X"}};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]=="X")
				{
					for(int k=i-1;k<=i+1&&k<arr.length;k++)
					{
						if(k<0)
						{
							continue;
						}
						for(int m=j-1;m<=j+1&&m<arr.length;m++)
						{
							if(m<0)
							{
								continue;
							}
							if(arr[k][m]=="0")
							{
								count++;
							}
							
						}
					}
					
				        if(count>0)
				        {
					      arr[i][j]=String.valueOf(count);
				          count=0;
				        }
				}
			}
		}
		
		for(String[] k:arr)
		{
			System.out.println(Arrays.toString(k));
		}

	}

}
