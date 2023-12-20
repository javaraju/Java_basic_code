package com.pattern.java;

public class Dil {
			public static void main(String[] args) {
				int n=25;
				int m=15;
				int a=n-5;
				int b=a/2;
			
				int count=0;
				for(int i=1;i<=m;i++)
				{
					count++;
					for(int j=1;j<=n;j++)
					{
						
						
						
						if((count==1))
						{
							System.out.print("*");
						}
						else if(count==2)
						{
							if(j<=b||(b+5)<j)
							{
							
							System.out.print("*");
							}
							else
								System.out.print(" ");
						}
						
						else if(count==3)
						{
							if(j<=7||j==11||j==15||j>=19)
							{
							
							System.out.print("*");
							}
							else
								System.out.print(" ");
						}
						else if(count==4)
						{
							if(j<=5||j==13||j>=21)
							{
							
							System.out.print("*");
							}
							else
								System.out.print(" ");
						}
						else if(count>=5)
						{
							if(j<=i-1||j>=27-i)
							{
							
							System.out.print("*");
							}
							else
								System.out.print(" ");
							count++;
						}
						
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
					
				}
				

			

		


	}

}
