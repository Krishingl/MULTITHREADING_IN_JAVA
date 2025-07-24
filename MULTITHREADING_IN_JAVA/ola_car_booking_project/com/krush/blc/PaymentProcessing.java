package com.krush.blc;

public class PaymentProcessing extends Thread
{
      public void run() {
    	  
    	  
    	  try {
    	  System.out.println("Processing payment...");
    	  
    	      Thread.sleep(100);
    	  System.out.println("Payment successful!!");
    	  }
    	  catch(InterruptedException e) {
    		  System.err.println("Plz check "+Thread.currentThread().getName() +" Thread Are Interrupted");

    	  }
    	  
    	  
    	  
    	  
      }
	
	 
}
