package blc;

public class Drawer extends Thread {
	private Account account; // HAS-A Relation

	public Drawer(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() 
	{
           Double[] withdrawals = {  100.0 ,200.0,6000.0};
           
           
           for(Double withdraw : withdrawals) 
           {
        	   
        	   account.withdraw(withdraw);
        	   try {
        		   
				Thread.sleep(1500);
			   } 
        	   catch (InterruptedException e) {
				
				e.printStackTrace();
			}
           }
	}
}
