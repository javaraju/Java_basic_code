package com.DataStructure.java;

public class DStack {
		int capacity=2;
		int stack[]=new int[capacity];
		int k=0;
		
		public void push(int data)
		{
			if(size()==capacity)
				expand();
			stack[k]=data;
			k++;
			
		}
		private void expand() {
			int length=size();
			int newStack[]=new int[capacity*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
			capacity=capacity*2;
			
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
			shrink();
			}
			return data;
		}
		public void shrink() {
			int length=size();
			if(length<=(capacity/2)/2)
			capacity=capacity/2;
			
			
			int newStack1[]=new int[capacity];
			System.arraycopy(stack, 0, newStack1, 0, length);
			stack=newStack1;
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
			System.out.println();
		}
		
		
	}



