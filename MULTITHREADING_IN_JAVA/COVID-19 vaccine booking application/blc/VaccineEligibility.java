package blc;
/*
 Design a COVID-19 vaccine booking application that allows users to check their eligibility based on age and health conditions.
 Users who meet the eligibility criteria can book a dose, and the application should handle concurrent user interactions using threads.

 */
public class VaccineEligibility 
{
	private int age;   //The age of the user.
	
	private boolean hasHealthCondition; //A boolean indicating whether the user has a health condition.

	public VaccineEligibility(int age, boolean hasHealthCondition)
	{
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible() {
		boolean flag=false;
		if(this.age>=18  && this.age <60  &&hasHealthCondition)
		{
		    flag=true;	
			
		}
		return flag;
	}


}
