package com.pattern.java;

public class PatternStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
char k;
//int k;
for(i=1;i<=4;i++)
{
	k='A';
	//k=1;
	for(j=1;j<=7;j++)
	{
		if(j<=5-i||j>=3+i)
		{
			
			System.out.print(k);
			//k=(j<4)?k++:k--; its not work!
			
			if(j<=4)
			{
				k++;
			}
			else
			{
				k--;
			}
		}
		else
		{
			System.out.print(" ");
			if(j==4)
			{
				k--;
			}
			
		}
	}
	System.out.println();
}
	}

}
