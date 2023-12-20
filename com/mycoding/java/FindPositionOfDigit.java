package com.mycoding.java;

import java.util.Scanner;

public class FindPositionOfDigit {
	public static int exactPosition(int number,int digit)
	{
		int position=1;
		while(number!=0)
		{
			int r=number%10;
			if(r==digit)
			{
				break;
			}
			number=number/10;
			position*=10;
		}
		return position;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		System.out.println("Enter a Digit:");
		int digit=sc.nextInt();
		if(digit>9)
		{
			System.out.println("The position is: "+-2);
		}
		else if(digit<0)
		{
			System.out.println("The position is: "+0);
		}
		else
		{
		int position=exactPosition(number,digit);
		System.out.println("Exact position of "+digit+" in "
		+number+" is: "+position);
		}

	}

}
