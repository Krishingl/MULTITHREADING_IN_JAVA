package com.krush.synchronization.test_cases;

class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("MyThread: run()");
	}

	public void start()
	{
		System.out.println("MyThread: start()");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable: run()");
	}

	public void start()
	{
		System.out.println("MyRunnable: start()");
	}
}

public class Test72
{
	public static void main(String args[])
	{
		MyThread1 myThread  =  new MyThread1();
		MyRunnable myRunnable = new MyRunnable();
		Thread thread  =  new Thread(myRunnable);
		myThread.start();
		thread.start();
	}
}
