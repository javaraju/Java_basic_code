package com.AppsPatern.java;
import java.io.*;

public class Pattern43 {

	public static void main(String[] args)
	{
		
			int n=5;
			int m=9;
			int k=0;
			for(int i=1;i<=n;i++)
			{				
				for(int j=1;j<=m;j++)
				{
					
					if(j>=6-i&&j<=4+i)
					{
						System.out.print(k);
						if(j<=4)
						{
							k--;
						}
						else if(j>=5)
						{
							k++;
						}
					}
					else
					{
					System.out.print(" ");
					}
					
				}
				System.out.println();
			}
				
		
		
		
		/*File f = new File("D:");
		String arr[]=f.list();
	    FileInputStream fs = new FileInputStream(f);
		int i=0;
		while((i=fs.read())!=-1)
		{
			System.out.println((char)i);
		} 
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

		}
		fs.close();
		
*/
	}

}
