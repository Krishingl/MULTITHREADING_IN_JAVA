package com.krush.block_level_synchronization;

class PrintThread
{
	
	public  void printThreadName() {
	String name = Thread.currentThread().getName();
	
	System.out.println("Thread Name is : "+name);
	
	
	
	synchronized(this){
		for(int i=1;i<=10;i++) {
			
			
			
			System.out.println(i+" by "+name +" thread ");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Synchonzed block ended!!!");
		
	}
	}

	
}

public class BlockLevelSynchronization {

	public static void main(String[] args) {
		       PrintThread pt= new PrintThread();//Lock1 is created 
		       
		       
		       
		       Runnable r1=()-> pt.printThreadName();  //Lambda for r1 thread anonyous inner class and there run method implimented and we are calling in that our logic method
		       
		       Thread t1= new Thread(r1,"Child1");
		       Thread t2= new Thread(r1,"Child2");
		       
		       t1.start();
		       t2.start();

	}

}
