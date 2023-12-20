package com.Queue.java;

public class DQueue {

		int queue[]=new int[5];
		int rear;
		int front;
		int size;
		public void enQueue(int data)
		{
			if(!isFull())
			{
			queue[rear]=data;
			rear=(rear+1)%5;
			size=size+1;
			}
			else
			{
				System.out.println("Queue is full.");
			}
			
		}
		public int deQueue()
		{
			int data=queue[front];
			if(!isEmpty())
			{
			
			front=(front+1)%5;
			size=size-1;
			}
			else
			{
				System.out.println("Queue is Empty.");
			}
			return data;
			
		}
		public void show()
		{
			System.out.print("Element is: ");
			for(int i=0;i<size;i++)
			{
				System.out.print(queue[front+i]%5+" ");
			}
			System.out.println();
			
			for(int n:queue)
			{
				System.out.print(n+" ");
			}
		}
		public int getSize()
		{
			return size;
		}
		public boolean isEmpty()
		{
			return getSize()==0;
		}
		public boolean isFull()
		{
			return getSize()==5;
		}

	}



