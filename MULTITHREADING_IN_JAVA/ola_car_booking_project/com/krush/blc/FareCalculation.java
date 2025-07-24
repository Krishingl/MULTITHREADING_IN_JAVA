package com.krush.blc;

public class FareCalculation extends Thread
{
	
	@Override 
	public void run() {
		try {
			
			
			System.out.println("Calculating estimated fare...");
			Thread.sleep(1500);
			
			System.out.println("Estimated fare: 135.75 RS.");
		} catch (InterruptedException e) {
			System.err.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");
			//e.printStackTrace();
		}
		
		
		
	}

}
