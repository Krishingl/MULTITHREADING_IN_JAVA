package com.multithreading.itc;

//4)WAP to withdraw the amount after successful deposit if amount is less.

class Customer
{
	private double balance;
	 Customer(double balance)
	 {
		 this.balance= balance;
	 }
	
	public synchronized void withdraw(double amount)
	{
		  System.out.println("Going for withdraw..!!");
		if(this.balance<amount) {
			System.out.println("Balance is insufficient, waiting for deposit..");
			try {
				wait();//withdraw thread are going to waiting state and its relesed the object lock | it reaquire lock line no 44 then it excute the remaning task 
			} catch (InterruptedException e) {
				
				System.err.println("Withdraw thread is interrupted..!");
			}
		}
		
		
		this.balance= this.balance-amount;
		
		System.out.println("Balance After Withdraw is : "+this.balance);
		
		
	}
	
	
	
	public synchronized void deposit(double amount)
	{
		
		 System.out.println("Going for deposit..!!");
		this.balance= this.balance+amount;
		notify();//Withdraw thread is comming  from waiting state to blocked state and waiting for object lock
	System.out.println("Balance after deposit is : "+this.balance);
		
	}//withraw thread got a lock
	
	public double getBalance() {
		
		return this.balance;
	}
}
public class ITCDemo4 {

	public static void main(String[] args)
	{
          Customer cust= new Customer(10000);
          
          
          new Thread(()->cust.withdraw(15000),"Withdraw Thread").start();//son
        
          new Thread(()->cust.deposit(10000),"Deposit Thread").start();//father
         
         
         
	}
	
	

}
