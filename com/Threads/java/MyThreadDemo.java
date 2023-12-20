package com.Threads.java;

public class MyThreadDemo extends Thread {
	static Thread mt;
	public void run()
	{
		try 
		{
		mt.join();
		}
		catch(InterruptedException e)
		{
			
		}
		/*finally
		{
			System.out.println("I am for Cleanup");
		}*/
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args)throws InterruptedException
	{
		
		MyThreadDemo.mt=Thread.currentThread();
		MyThreadDemo t=new MyThreadDemo();
         t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
			Thread.sleep(2000);
		}

	}
}
	