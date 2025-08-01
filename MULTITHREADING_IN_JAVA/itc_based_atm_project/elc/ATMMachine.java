package elc;

import blc.Account;
import blc.Depositor;
import blc.Drawer;

public class ATMMachine 
{

	public static void main(String[] args) 
	{
		   
		Account acc= new Account();
		Drawer drawer= 
		new Drawer(acc);
		
		
		Depositor depositor=
				new Depositor(acc);
		
		
		      drawer.start();
		      depositor.start();
				
				try {
					depositor.join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Thank You..!!");
		
		
		
		
		
	}
}