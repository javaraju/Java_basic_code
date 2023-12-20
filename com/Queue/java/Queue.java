package com.Queue.java;

public class Queue {
	int queue[]=new int[5];
	int rear;
	int front;
	int size;
	public void offer(int data)
	{
		queue[rear]=data;
		rear=rear+1;
		size=size+1;
	}
	public int peek()
	{
		int data=0;
		if(size==0)
		{
	      System.out.println("Null");
		}
		else
		{
	    data=queue[front];
		}
		return data;
		
	}
	public int element()
	{
		int data=0;
		if(size==0)
		{
			System.out.println("NoSuchElementException");
		}
		else
		{
			data=queue[front];
			
		}
		return data;
	}
	/*public int poll()
	{
		int data;
		data=queue[front];
		int newQueue[]=new int[size];
		for(int i=0;i<size;i++)
		{
			newQueue[i]=queue[i+1];////////WRONG....WRONG..WRONG.....
		}
		queue=newQueue;
		return data;
	}*/
	public void show()
	{
		System.out.print("Element is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}

}
