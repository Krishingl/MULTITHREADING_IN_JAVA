package com.multithreading.basic;
import java.util.RandomAccess;

class MyThread extends Thread{
//	@Override
//	 public long getId() {   
//		
//		
//		 return 100;
//	 }

	@Override
	public void run() {
		
		for(int i=1 ;i<=5;i++) {
			
			   System.out.println(Thread.currentThread().threadId()+"  By  "+Thread.currentThread().getName()+"= "+i);
			   
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}




public class ThreadFight {
	
	
	
	public static void main(String args []) throws InterruptedException 
	
	{
		  MyThread mt1= new MyThread();
		  
		 System.out.println("Thread is Alive : "+ mt1.isAlive());// if thread is alive(started) then its return ture or if its not started then its return false 
		    
		 mt1.start();     //Here one Thread are strated That is Thread-0
		// mt1.setName("MyThread 1");  //Changeing name of Thread -0 to MyThread 1
		 
		 new MyThread().start();  //Thread-1
		 
		 System.out.println();
		 System.out.println("Thread is Alive : "+ mt1.isAlive());
		 System.out.println("Thread is Alive : "+Thread.currentThread().getName());
		 Thread.currentThread().join();
		 System.out.println("Thread is Alive : "+ mt1.isAlive());
		 new MyThread().start(); 
		// new MyThread().start();
		 System.out.println("hhhh");
		 System.out.println("Thread is Alive : "+ mt1.isAlive());
		 System.out.println(Thread.currentThread().getName()+" thread is ended.");
		 
		 
		
	}

}




