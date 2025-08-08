package blc;

public class DoseBooking 
{
	private boolean booked=false;// A boolean indicating whether the user has booked a dose.
   
	
	public void   bookDose(boolean booked)
      {
    	   if(!booked) {
    		      throw  new RuntimeException("Dose already booked.");
    	   }
    	   else {
    		    this.booked=booked;
    		    
    	      }
      }
	
	
	public boolean isDoseBooked()
	{
	  return this.booked;
	}

}
