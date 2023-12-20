package com.stack.java;

public class DStack {
		int top=0;
		int capacity=2;
		int stack[]=new int[capacity];
		public void push(int data)
		{
			
			stack[top]=data;
			top++;
			expand();
			
		}
		private void expand() {
			if(top==capacity)
			{
				int newStack[]=new int[capacity*2];
				for(int i=0;i<stack.length;i++)
				{
					newStack[i]=stack[i];
				}
				stack=newStack;
				capacity=capacity*2;
				
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
			shrink();
			}
			
			return data;
		}
		private void shrink() {
			int length=size();//or top
			if(length==(capacity/2)/2)
			{
				int newStack[]=new int[length*2];
				System.arraycopy(stack, 0, newStack, 0, length);
				stack=newStack;
			}
			
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



