package com.Threads.java;

public class ThreadDemo3 extends Thread {
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("I am lazy person");
				Thread.sleep(2000);
				
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted");
		}
	}

	public static void main(String[] args) {
		ThreadDemo3 t=new ThreadDemo3();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");



	}

}
