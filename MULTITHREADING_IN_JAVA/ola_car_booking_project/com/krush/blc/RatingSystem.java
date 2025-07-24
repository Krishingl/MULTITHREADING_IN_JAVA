package com.krush.blc;

public class RatingSystem extends Thread
{
	public void run() {
		
		try {
		System.out.println("Requesting user rating...");	
		Thread.sleep(1000);
		 System.out.println("User rated the ride: 5 star");
		}
		catch(InterruptedException e) {
			
			 System.err.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");

		    	
		}
		
	}

}
