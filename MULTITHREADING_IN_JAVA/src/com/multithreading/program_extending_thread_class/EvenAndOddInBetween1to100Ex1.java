package com.multithreading.program_extending_thread_class;
//By using Anonymous Inner class
public class EvenAndOddInBetween1to100Ex1 {
	
	
	

	public static void main(String[] args) {
		
		
		      //Anonymous innner class Extend from Thread class
		  Thread t= new Thread() {
			  
			 @Override 
			 public void run() {
				 
				for(int i=1;i<=100;i++) {
					if(i%2!=0) {
					System.out.print(i+" by "+Thread.currentThread().getName()+"   ");
					}
					if(i%5==0&&i%10!=0)System.out.println();
				}
				
				
				 
			 }
			  
		  };
		  t.start();
		  try {
			t.join();
		} catch (InterruptedException e) {
			  
			e.printStackTrace();
		}
		  
		  
		  System.out.println();
		  
		  System.out.println("========================================================");
		
		  for(int i=1;i<=100;i++) {
				if(i%2==0)
				{
		 System.out.print(i+" by "+Thread.currentThread().getName()+"   ");
	} 
	if(i%5==0&&i%10!=0)System.out.println();
		
		  }
		
		

	}

}
