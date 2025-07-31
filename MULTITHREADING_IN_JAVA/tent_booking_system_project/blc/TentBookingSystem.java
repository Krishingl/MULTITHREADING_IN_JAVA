package blc;

public class TentBookingSystem 
{

	  boolean paymentDone = false;
	  
	  
	   // Customer thread will wait until payment is completed
	  public synchronized void bookTent(String customerName)
	  {
		  System.out.println(customerName +" wants book a tent...");
		  
		  
		  if(!paymentDone)
		  {
			  
			  System.out.println(customerName+" is waiting for makeing payment...");
			  try
			  {
				  wait();
			  }
			  catch(InterruptedException e) {
				  System.out.println("Interrupted");
			  }
			  
			  
		  }
		  
	        System.out.println(customerName + "'s tent booked successfully!");
		  
	  }
	  
	   // Payment thread will notify once payment is completed
	  
	  public synchronized void makePayment(String customerName)
	  {
		  System.out.println(customerName + " is making payment...");
	        try {
	            Thread.sleep(2000); // Simulating delay in payment
	        } catch (InterruptedException e) {}

	        paymentDone = true;
	        System.out.println("Payment done by " + customerName);
	        notify(); // Wake up booking thread and its going to in site blocked state 
		  
		  
		  
	  }//now lock will geted the Customer thread
	  
	  
	  
}
