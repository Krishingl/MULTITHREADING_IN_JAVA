package com.krush.method_level_synchronization;


class Table
{
	
    
	public synchronized void printTable(int num) //Synchronization Area Started Here 
	{ 
		
		for(int i=1;i<=10 ;i++)
		{
			System.out.println(num+" X "+i+ " = "+(num*i));
               
			try {
				
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted");
			}
		}
		     System.out.println("...................................");
			}
}  //Ended Here
public class MethodLevelSynchronization
{  
       public static void main(String args[])
       {
    	   Table table = new Table(); // lock is created
    	   
    	   
    	   Thread t1 = new Thread() 
    	   {     
    		     @Override
    		   public void run() 
    		   {
    			   table.printTable(5);
    		   }
    		   
    	   };
    	   

    	   Thread t2 = new Thread() 
    	   {     
    		     @Override
    		   public void run() 
    		   {
    			   table.printTable(9);
    		   }
    		   
    	   };
    	   
    	      t1.start();
    	     t2.start();
    	   
    	  
       }
}
