package com.krush.blc;

public class Restaurant
{
	private String restaurantName;
	private String order;
	private boolean isOrderReady = false; //[Initial Order Status]
	public Restaurant(String restaurantName) {
		super();
		this.restaurantName = restaurantName;
		
	}
              public synchronized void  placeOrder(String order) 
              {      
            	  this.order= order;
            	  
            	  System.out.println("Waiter: Placed order for "+this.order);
            	  while(!isOrderReady) 
            	  {
            		       
            		  try {
            			  
            			  wait();
            		      }
            		  catch(InterruptedException e) 
            		  {
            			  System.err.println("place order thread is Interrupted..");
            		  }
            		  
            	  }
            	  System.out.println("Waiter: Serving the "+order);
            	  
            	  
              }
              
              public synchronized void prepareOrder()
              { 
            	    
            	  System.out.println("Chef: Preparing "+this.order);
            	  
            	  try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					System.err.println("Chef thread is Interrupted");
				}
            	  System.out.println("Chef: "+this.order+" is ready!");
            	  notify();
            	  isOrderReady=true;

            	  
            	  
            	  
            	    
            	  
              }
              
              public String getRestaurantName() {
            	  return this.restaurantName;
              }
              
}
