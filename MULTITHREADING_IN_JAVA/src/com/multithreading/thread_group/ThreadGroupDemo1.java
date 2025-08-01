package com.multithreading.thread_group;



class UserThread implements Runnable
{

	@Override
	public void run()
	{
		
		String name = Thread.currentThread().getName();
		
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ " by "+name+" thread.");
		}
	}
	
}
public class ThreadGroupDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("Java_Batch");
		
		
		
		Thread t1= new  Thread(group,new UserThread(),"child1");
		
		Thread t2= new  Thread(group,new UserThread(),"child2");

		Thread t3= new  Thread(group,new UserThread(),"child3");

		Thread t4= new  Thread(group,new UserThread(),"child4");
		
		t1.start(); t2.start();  t3.start(); t4.start();
       System.out.println(t1); 
       Thread.sleep(10);
       System.out.println("Thread Group Name : "+group.getName());
       System.out.println("Active Threads Count In Thread Group : "+group.getName()+" Count is : "+group.activeCount());

       
       
       Thread.sleep(100);
       System.out.println("Thread Group Name : "+group.getName());
       System.out.println("Active Threads Count In Thread Group : "+group.getName()+" Count is : "+group.activeCount());

	}

}
