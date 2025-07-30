package com.krush.synchronization.test_cases;

public class Test56 implements Runnable
{
 public void run() 
 {
	 try
	 {
		 System.out.println("run.");
         throw new RuntimeException("Problem");
		
	 }
	 catch (Exception e)
	 {
		 System.out.println("Handled");
	 }
 
 }
 public static void main(String[] args) 
 {
 Thread t = new Thread(new Test56());
 t.start();
 System.out.println("End of method.");
 }
}
