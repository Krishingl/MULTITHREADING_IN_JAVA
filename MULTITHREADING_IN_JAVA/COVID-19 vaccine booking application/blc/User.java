package blc;

public class User {

	private String name;// The name of the user.

	private VaccineEligibility eligibility;// An instance of the VaccineEligibility class to check the user's
											// eligibility.
	private DoseBooking doseBooking;// An instance of the DoseBooking class to manage dose booking for the user.

	public User(String name, int age, boolean hasHealthCondition) {
      
		this.name = name;
		this.eligibility = new VaccineEligibility(age, hasHealthCondition);
		 doseBooking= new DoseBooking();
		    
	}

	public boolean isEligible() {
		return eligibility.isEligible();
	}

	public void bookDose() {
		
		if (!eligibility.isEligible()) {
	
			throw new RuntimeException("You are not eligible for the vaccine.");

		}
		else{
			doseBooking.bookDose(true);
			//System.out.println("Your dose Booked Succesfully.");
		
		}
		    

	}
	
	public boolean isDoseBooked() {
		return this.doseBooking.isDoseBooked();
	}
	public String getName() {
		return this.name;
	}

}
