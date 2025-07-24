package com.krush.blc;

public class LiveTracking extends Thread {
	
	  public void run() {
		  
		  for(int i= 20;i<=100;i+=20) {
			  
			  
			
			  try {
				  
				  
				  System.out.println("Updating ride location... "+i+"% completed");
				  
				Thread.sleep(1000);
				
				
				 
				 
			} catch (InterruptedException e) {
				System.err.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");

				//e.printStackTrace();
			}
			  
			  
			  
		  }
		 
		  System.out.println("Ride completed!");
	  }

}
