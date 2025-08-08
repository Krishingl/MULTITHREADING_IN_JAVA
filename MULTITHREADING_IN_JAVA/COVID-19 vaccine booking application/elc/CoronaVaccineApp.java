package elc;

import blc.User;

public class CoronaVaccineApp 
{      
	  public static void main(String[] args) throws InterruptedException 
	  {
		  
		  User u1 = new User("Scott",18,true);
		  User u2 = new User("Allean",45,true);
		  
		  Thread thread1=
		  new Thread(()->{

		    u1.bookDose();
			    System.out.println( u1.getName()+(u2.isDoseBooked()?" Dose booked successfully" :" Dose not booked"));
			    System.out.println(u1.isEligible()?" is eligible for the vaccine.":" is not eligible for the vaccine.");
				  
				  
		  });
		  thread1.start();
		 thread1.join();
		 
		 
		 System.out.println("-----------------------------------------------------------------");
		 // Thread thread2
		  new Thread(()->{
			    u2.bookDose();
			   System.out.println( u2.getName()+(u2.isDoseBooked()?" Dose booked successfully" :" Dose not booked"));
			    System.out.println(u2.isEligible()?" is eligible for the vaccine.":" is not eligible for the vaccine.");
				  
		  }).start();
	  }
	

}
