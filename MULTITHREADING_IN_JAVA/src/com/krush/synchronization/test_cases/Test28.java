package com.krush.synchronization.test_cases;

public class Test28 extends Thread
{
	@SuppressWarnings("deprecation")
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getId()+" "); 
		//getId() mathod is deprecated from java 19 version because it is not final any one can change the id by ovrriding this method then use the threadId()
		//1 
		Thread t1 = new Thread(new Test28(),"Rahul");
		Thread t2 = new Thread(new Test28(),"Ravi");
		Thread t3 = new Thread(new Test28(),"Puja");
		t3.start();
		t1.start();
		t2.run();
		t2.start();
	}
	public  void run()
	{
		    for(int i=0; i<2; i++)
			{
			System.out.println(Thread.currentThread().getName()+" I'm :"+i);  
			}
			System.out.println("It is end of loop");
	}
}
/*   Note : Output is Un accepected
  1 
Puja I'm :0
main I'm :0
Puja I'm :1
It is end of loop
Rahul I'm :0
Rahul I'm :1
It is end of loop
main I'm :1
It is end of loop
Ravi I'm :0
Ravi I'm :1
It is end of loop

 */

