package com.Threads.java;
class ThreadDemo2 extends Thread {
	 public void run()
	 {

for(int i=0;i<10;i++)
{
			 System.out.println("run");
}
try
{
	System.out.println("i am going to sleep");
	Thread.sleep(2000);
	//System.out.println("i am going to sleep");
	//Thread.sleep(2000);

}
catch(InterruptedException e)
{
System.out.println("i am sleeping");		
}
}
	 public static void main(String[] args) //throws InterruptedException
	 {
		 
	 ThreadDemo2 t=new ThreadDemo2();
	
	 t.start();
	 try {  //try catch hatayenge to throws wala kam karega koi ek hona chahiye
	t.join();
	 
	//t.interrupted();
	 
	 
	 for(int i=0;i<=10;i++)
	 {
	 System.out.println("main");
	 //Thread.sleep(1000);
	 //System.out.println("After");
	 }
	 }
	 catch(InterruptedException e)
	 {
		 
	 }
	 }

}