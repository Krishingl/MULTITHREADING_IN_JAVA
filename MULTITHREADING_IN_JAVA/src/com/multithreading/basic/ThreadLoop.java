package com.multithreading.basic;


class Sample extends Thread 
{
	@Override
	public void run() 
	{
		       
		
	
		String name = Thread.currentThread().getName();
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ " by "+name+" thread");
		}
		
		
	}
	
	
	
	
	
	
	
	
}
public class ThreadLoop 
{
      public static void main(String args[])
      {
    	    Sample s1= new Sample();
    	    
    	    s1.start();
    	    
    	    
    	    
    	  
int k=1;


  		for(int i=1;i<=10;i++)
  		{
  			System.out.println(i+ " by "+ Thread.currentThread().getName()
+" thread");
  		}
  		
  		do {
  		System.out.println("Java");
  		k++;
  		}while(k<=10);
  		
  		
      }
}
