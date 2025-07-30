package com.krush.synchronization.test_cases;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");//1
		Thread thread = Thread.currentThread(); // main thread object
		String name = thread.getName();//main
		
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");  
			Thread.sleep(1000);
			thread.join(); //Dedlog
		}		
		System.out.println("Main thread ended");
	}

}