package blc;

public class Depositor  extends Thread
{
    private Account account;  //HAS-A Relation

	public Depositor(Account account) {
		super();
		this.account = account;
		
		
	}
	
	
	public void run() {
		
		Double[] deposits= {2000.0,200.0,400.0,7000.0};
		
		
		for(Double deposit : deposits)
		{
			account.deposit(deposit);
			 try {
      		   
					Thread.sleep(1500);
				   } 
	        	   catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		}
		
		
	}
    
}
