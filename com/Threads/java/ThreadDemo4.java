package com.Threads.java;

public class ThreadDemo4 extends Thread {
	static Thread mt;
	public void run()
	{
		try {
		mt.join();
		}
		catch(InterruptedException e)
		{
			
		}
		for(int i=0;i<10;i++)
		{
			try {
			System.out.println("Child Thread: "+i);
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				
			}
		}
	}

	public static void main(String[] args)throws InterruptedException
	
	{
		ThreadDemo4.mt=Thread.currentThread();
		ThreadDemo4 t=new ThreadDemo4();
		t.start();
		//t.join();//if we remove that comment we will get Deadlock
		           // becouse both join method call to each other.
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+i);
			Thread.sleep(2000);
		}
	}

}
