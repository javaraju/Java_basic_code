package com.Threads.java;

public class SleepDemo extends Thread {
	public void run()
	{
		try
		{
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am lazy Person");
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted");
		}
	}

	public static void main(String[] args) {
		SleepDemo t=new SleepDemo();
		t.start();
		t.interrupt();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main methods");
		}



	}

}
