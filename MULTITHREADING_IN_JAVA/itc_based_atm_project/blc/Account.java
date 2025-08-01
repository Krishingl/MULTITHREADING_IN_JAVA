package blc;

public class Account 
{
       private Double balance =(double) 0; //(Initial Balance is 0)
       
       public synchronized void withdraw(Double amount) 
       {     
    	   while(this.balance<amount  ) 
    	   {
    		   
    		   try {
    			   
    			   System.out.println("Balance Not available Wait For Deposit..");
    		   wait();//waiting for notify and lock
    		   }
    		   catch(InterruptedException e)
    		   {
    			   System.err.println("Withdraw thread is interrupted..");
    		   }
    		   
    		   
    		   
    	   }
    	   this.balance-=amount;
    	  
            System.out.println(" After Withdraw Your Updated balance is : "+this.balance);
    	   
       }
       public synchronized void deposit(Double amount) 
       {
    	        if(!(amount>0.0)) 
    	        {
    	        	System.err.println("amount should be Greater than 0");
    	        	System.exit(0);
    	        }
    	        this.balance+=amount;

                System.out.println(" After deposit Your Updated balance is : "+this.balance);
    	        notify();
    	        
    	        
       }
       
       
       
       
       
       
}
