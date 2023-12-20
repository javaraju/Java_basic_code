package com.mountblue.java;

public class TreeBuildingCount {

	public static void main(String[] args) {
		int arr[][]=new int[8][8];
		countTree(arr);
	}
	static void countTree(int[][]arr)
	{
		int r=3,c=3;
		int count=0;
		int row,col;
		row=r-1;col=c-1;
		if(row-2<0||row+2>=arr.length||col-2<0||col+2>=arr.length)
		{
			System.out.println("we can't build building here,Sorry! bcs we will go outside of our land.");
			return;
		}
		else 
		{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=1;
			}

		}
		/*for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
			for(int i=col-2;i<=col+2;i++)
			{
				for(int j=row-2;j<=row+2;j++)
				{
					if(arr[j][i]==1)
					{
						count++;
					}
					else
					{
						continue;
					}
				}
			}
			
		}
		System.out.println("Total Tree will come inside of our building is: "+count);
		
    }

}
