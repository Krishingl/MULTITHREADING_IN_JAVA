package com.krush.blc;

public class DriverAssignment extends Thread {
	
	
	@Override 
	public void run() {
		try {
			Thread.sleep(3000);
			
			System.out.println("Driver found and assigned!");
		} catch (InterruptedException e) {
			System.err.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");
			//e.printStackTrace();
		}
		
		
	}
}
