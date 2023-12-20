package com.Threads.java;

public class ThreadDemo1 extends Thread {
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Threads: "+i);
		}
	}

	public static void main(String[] args)
	{
		ThreadDemo1 th=new ThreadDemo1();
		th.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main: "+i);
		}
		



	}

}
