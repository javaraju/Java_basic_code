package com.mountblue.java;

public class LandProblem {
static void 	ArrayIncreasingSum(int a[])
{
int sum = 0;
int count = 1;
int tempCount = count ;
for(int i=0;i<a.length;i++)
{
	tempCount = count;
	sum = 0;
	while(tempCount != 0)
	{
		sum = sum + a[i];
		i++;
		tempCount--;
	}
	count++;
	i--;
	System.out.print(sum+" ");
	}
}
static void MultiplyAndDivide(int a[])
{
	if(a.length < 3)
	{
	System.out.println("Minimum Requirement is 3 elements");
	return;
	}
	double result = 0;
	result = (double)(a[0])/(a[1]);
	result =result*a[2];
	System.out.println(result);
}
static void StringSplit(String s)
{
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) != '@')
		{
			System.out.print(s.charAt(i));
		}
		else {
			break;
		}
	}
}
public static void main(String args[])
{
int a[] = {1,2,3,4,5,6,7,8,9,10};
ArrayIncreasingSum(a);
System.out.println();
int b[] = {1,2,3};
MultiplyAndDivide(b);
String s = "raju@gmail.com";
StringSplit(s);
}
}
