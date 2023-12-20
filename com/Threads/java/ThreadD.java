package com.Threads.java;

public class ThreadD extends Thread {

	
	public void run()
	{
	for(int i=0;i<=10;i++)
	{
		System.out.println("Run method "+i);
	}
	}
	public void fun()
	{
	   start();	
	}
	
	public static void main(String[] args) {
	ThreadD d=new ThreadD();
	d.start();
	d.fun();
	for(int j=1;j<=10;j++)
	{
		System.out.println("Main Thread "+j);
	}

	}

}
