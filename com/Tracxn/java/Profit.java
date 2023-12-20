package com.Tracxn.java;
import java.util.*;

public class Profit {

	public static void main(String[] args) {

int a[]= {55,2,88,96,695,45,21};
//int profit=0,Day1=0,Day2=0;
/*for(int i=0;i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[j]-arr[i]>profit)
		{
			profit=arr[j]-arr[i];
			Day1=i+1;
			Day2=j+1;
		}
		
	}
}*/
//int max = a[0];
//int maxIndex = 0;
//for(int i=0;i<a.length;i++)
//{
//	if(a[i] > max  )
//	{
//		max = a[i];
//		maxIndex =i;
//	}
//}
//
//int min = a[0];
//int minIndex = 0;
//for(int i=0;i<maxIndex;i++)
//{
//	if(a[i] < min)
//	{
//		min = a[i];
//		minIndex =i;
//	}
//}
//
//int Day1 = minIndex+1;
//int Day2 = maxIndex+1;
//int profit = max - min;

TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
for(int i=0;i<a.length;i++)
	{
	map.put(a[i], i);
	}
int max = 0;
int minIndex = 0;
int min = 0;
for(Map.Entry<Integer,Integer> e : map.entrySet())
{
	max = map.lastEntry().getValue();
	
	if(max > e.getValue());
	{
		min = e.getKey();
		minIndex = e.getValue();
		break;
	}
}

int Day1 = minIndex+1;
int Day2 = max+1;

int profit = a[Day2-1]- min;

System.out.println("Buy- "+Day1 + "-sall- "+Day2+ "-Profit= "+profit);

	}

}
