package com.DataStructure.java;

public class Stack {
	
	int stack[]=new int[5];
	int k=0;
	
	public void push(int data)
	{
		if(k==5)
		{
			System.out.println("Stack is full:");
		}
		else
		{
		stack[k]=data;
		k++;
		}
	}
	public  int pop()
	{
		
		int data=0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty.");
		}
		else 
		{
		k--;
		data=stack[k];
		stack[k]=0;
		
		}
		return data;
	}
	public int peek()
	{
		int data;
		data=stack[k-1];
		return data;
	}
	public boolean isEmpty()
	{
		return k<=0;
		/*if(k==0)
		{
			return true;
		}
		else
		{
			return false;
		}*/
	}
	public int size()
	{
		return k;
	}
	public void show()
	{
		System.out.print("Total Element in Stack is: ");
		for(int a:stack)
		{
			System.out.print(a+ " ");
		}
	}
	
	
}
