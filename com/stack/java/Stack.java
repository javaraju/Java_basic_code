package com.stack.java;

public class Stack {
	int top=0;
	int len=5;
	int stack[]=new int[len];
	public void push(int data)
	{
		if(top==len)
		{
			System.out.println("Stack size is over,Please increase the size:?. ");
		}
		else
		{
		stack[top]=data;
		top++;
		}
	}
	public int pop()
	{
		int data=0;
		if(size()==0)
		{
			System.out.println("No Any Value in stack.");
		}
		else 
		{
		top--;
		data=stack[top];
		stack[top]=0;
		}
		
		return data;
	}
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	public int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public void show()
	{
		for(int a:stack)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}


}
