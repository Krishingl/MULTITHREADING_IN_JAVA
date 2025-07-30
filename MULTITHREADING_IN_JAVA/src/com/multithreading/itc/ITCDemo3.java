package com.multithreading.itc;
//WAP to show by using ITC we can get the proper output
public class ITCDemo3 
{

	public static void main(String[] args) throws InterruptedException
	{
		Demo d1= new Demo();
		  d1.start();
		  
		  synchronized(d1) {
			  
			  
			  System.out.println("Main thread is  going to wait...");
			  
			  d1.wait();
			  System.out.println("Main thread got notification");
			  System.out.println(d1.getVal());
			  
		  }
	}
}

class Demo extends Thread
{
	
	
	private int val = 0;
	public void run() {
		
		synchronized(this) {
			System.out.println("Child Thread got the lock.....");
		
		for(int i=1;i<=100;i++)
		{
			val= val+i;
			
		}
		System.out.println("child thread is sending notification....");
		   notify();
		}
		
		
	
	}
	
	public int getVal() {
		return this.val;
	}
}