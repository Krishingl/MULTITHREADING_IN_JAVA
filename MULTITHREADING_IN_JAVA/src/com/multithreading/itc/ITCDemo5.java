package com.multithreading.itc;

class TicketSystem
{
	 private int availableTicket;
	 
	      TicketSystem(int availableTicket){
	    	  this.availableTicket=availableTicket;
	  
	      }
	       
	 
	    
	 public synchronized void  bookTicket(int numberOfTickets)
	 {
		 
		 while( numberOfTickets > availableTicket )
		 {
			 System.out.println("Tickets are not available, Waiting for cancellation..");
			 
			 
			 try
			 {
				 wait();
			 }catch(java.lang.IllegalMonitorStateException |java.lang.InterruptedException e) 
			 {
				
				  System.err.println("Book Ticket Thread is Intrupted..");
			 }
			
			 
		 }
		 
		 this.availableTicket= this.availableTicket-numberOfTickets;
		 System.out.println("Booked "+numberOfTickets +" Ticket(s), Available tickets are "+this.availableTicket);
		 notify();
	 }
	 
	
	 
	 
	 public synchronized  void cancelTicket(int numberOfTickets)
	 {
		 this.availableTicket= this.availableTicket+numberOfTickets;
		 
		 System.out.println("Cancel "+numberOfTickets+" Ticket(s), Available ticket is "+this.availableTicket);
		 
		 notify();
	 }
}



public class ITCDemo5
{
    public static void main(String[] args)
    {
		TicketSystem ticketSystem = new TicketSystem(5);
		
		
		    //BookingThread 
		 new Thread(()->{
			 int bookingTickets[]= {5,2,5};
			 
			 for(int bookingTicket: bookingTickets) 
			 {
				 ticketSystem.bookTicket(bookingTicket);
				 
				 try{
				 Thread.sleep(1000);
				 }
				 catch(InterruptedException e) {
					 System.err.println(" Booking thread are Interrupted");
					 
				 }
			 }
			
			 
			 
		 }).start();
		 
		 
		 
		 
		 //CancelThread
		 new Thread(()->{
			 int cancelTickets[]= {1,3,3};
			 
			 for(int cancelTicket: cancelTickets) 
			 {
				 ticketSystem.cancelTicket(cancelTicket);
				 
				 try{
				 Thread.sleep(1000);
				 }
				 catch(InterruptedException e) {
					 System.err.println(" Cancel thread are Interrupted");
					 
				 }
			 }
			
			 
			 
		 }).start();
	
		
		
		
		
	}
}
