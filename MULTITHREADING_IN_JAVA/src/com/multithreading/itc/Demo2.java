package com.multithreading.itc;
//WAP that describes, If we don't have proper communication between two threads then output  is un-predictable
class Test implements Runnable
{
	private int data = 0;
	@Override
	public void run()
	{
		try {
			   Thread.sleep(5);
		}
		catch(InterruptedException e) {
			System.err.println(e);
		}
		
		
		
		for(int i=1;i<=10;i++) {
			data= data+i;
		}
		
	}
	
	
	
	public int getData() {
		return this.data;
	}
}



public class Demo2
{
	
  public static void main(String[] args) throws InterruptedException 
  {
	System.out.println("Main Thread Started...!!");
	
	Test t1= new Test();
	
	
	Thread thread = new Thread(t1,"Child Thread");
	thread.start();
	Thread.sleep(10);
	System.out.println(t1.getData());
	
	System.out.println("Main Thread ended!!!");
  }
}
