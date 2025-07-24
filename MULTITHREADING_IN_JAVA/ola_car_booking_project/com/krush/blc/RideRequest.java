package com.krush.blc;

public class RideRequest extends Thread
{   
	  @Override
	  public void run() {
		  
		  try {
			  
			  System.out.println("User requested a ride...");
			Thread.sleep(2000); //static method
			System.out.println("Searching for nearby drivers...");
			
		} catch (InterruptedException e) 
		  {
			    System.out.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");
//			e.printStackTrace();
		}
		  }
	  

}
