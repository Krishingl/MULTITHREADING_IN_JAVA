package com.multithreading.join;

 class Join extends Thread {
     @Override
     public void run()
     {
    	 String name = Thread.currentThread().getName();
    System.out.println(name+" Thread Started !!");
    	   for(int i=1; i<=5;i++) 
    	   {
    		   System.out.println(i+" by "+name+" thread ");
    		   
    		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
       System.out.println(name+" Thread is Completed!!!");
    
     }
}
//
// public class JoinDemo 
// {
//	 public static void main() {
//		 
//	 }
// }
