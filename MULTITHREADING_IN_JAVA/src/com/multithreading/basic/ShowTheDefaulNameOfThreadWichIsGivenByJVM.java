package com.multithreading.basic;


class Sample2 extends Thread{
    
	
//	@Override
	@SuppressWarnings("deprecation")
	public void run() 
	{
		   System.out.println("Name of the Child Thread given By the JVM : "+this.getName()+" running");  //getName is final method 

			  try {
				  this.interrupt();
				long name1=  this.getId(); 
				//It daprecated from java 19 verion because its not final may be chance we will not get jvm genrated thread value that its deprecated
				  
				  
				  //from java 19 java software people provide to us on method and thats overcome the final or Override problem
			     //they are provided one another method is threadId() its return the:==>  private final long tid;
				  long name2 =Thread.currentThread().threadId();
				  
				  
				  if(name1==name2) {//both are return same value becuase its are same only but deffrence is only getId() is not final and threadId() are final
				Thread.sleep(10000);
				  }
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}
	
	
}

public class ShowTheDefaulNameOfThreadWichIsGivenByJVM {

	public static void main(String[] args) throws InterruptedException
	{
		
		  Sample2 s1= new Sample2();
		  Sample2 s2= new Sample2();
		    
		  
		  s1.start(); 
		  s1.interrupt();
		  s2.start();
	
		 
		 
		  System.out.println("Name of the Main Thread given By the JVM : "+Thread.currentThread().getName()+" running");
		  
		  
		 
		  

	}

}
