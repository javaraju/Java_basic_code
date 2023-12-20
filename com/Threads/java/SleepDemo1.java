package com.Threads.java;

public class SleepDemo1 extends Thread 
{
	public void run()
	{
		try {
			
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Lazy Person");
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted");
		}
	}

	public static void main(String[] args)
	{
		SleepDemo1 t=new SleepDemo1();
		t.start();
		t.interrupted();
		
			System.out.println("Main Thraed");
		



	}

}
