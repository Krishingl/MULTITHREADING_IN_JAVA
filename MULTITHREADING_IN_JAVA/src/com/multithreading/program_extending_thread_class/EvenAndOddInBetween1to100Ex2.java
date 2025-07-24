package com.multithreading.program_extending_thread_class;


//This Thread will created by extending thread class
class EvenFinderThread extends Thread
{
	@Override
	public void run() 
	 
	{
		Thread.currentThread().setName("Even Number Thread");
		for(int i=1;i<=100 ;i++) 
		{
			if(i%2==0) {
				System.out.print(i+" By "+Thread.currentThread().getName()+"      ");

			}
			if(i%5==0 && i%10!=0 ) 
			{
				System.out.println();
			}else {
				continue;
			}
			
		}
		
	}
	
	
}


class OddFinderThread implements Runnable
{
	@Override
	public void run() 
	 
	{
		Thread.currentThread().setName("Odd Number Thread");
		for(int i=1;i<=100 ;i++) 
		{
			if(i%2!=0) {
				System.out.print(i+" By "+Thread.currentThread().getName()+"    ");

			}
			if(i%5==0 && i%10!=0 ) 
			{
				System.out.println();
			}else {
				continue;
			}
			
			
			
		}
		
	}
	
	
}


public class EvenAndOddInBetween1to100Ex2 {

	public static void main(String[] args) {
		
		System.out.println("By extending Tread class I am  created  EvenFinderThread  : ");
		
		EvenFinderThread e1=new EvenFinderThread();
		
		e1.start();
		
		/////////////=======================================================================================//////////////////////////////////////////////////////////////////////////
		
		Thread o1= new Thread(new OddFinderThread());
		 try {
			 e1.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	    System.out.println();
System.out.println("---------------------------------------------------------------------------------------------------");

		   
System.out.println("By implementing Runnable interface I am  created  OddFinderThread  : ");
		

o1.start();
///////////////////==========================================================================/   ///////////////////////////////////
		   
//By using lambda we are Oeverrided the run method of Runnable Interface
Runnable r1= ()->{
	 
	 Thread.currentThread().setName("Lambada Thread Odd");
	for(int i=1;i<=100 ;i++) 
	{
		if(i%2!=0) {
			System.out.print(i+" By "+Thread.currentThread().getName()+"    ");

		}
		if(i%5==0 && i%10!=0 ) 
		{
			System.out.println();
		}
	}	
		
		
	 
};
		
		        
Thread t1= new Thread(r1);//Thread  class we have Overrloded Constructor
try {
	o1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		 
	
		
		   
		
		
		
		
		
		
		
		
		
				    System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("By using Runnable Interface Implemnting using Lambda Thread will Created !");
	     
	     
	     
	     
	  
	       t1.start();
	       
	       
	       
	                  
	       
	       
	       

	}

}
