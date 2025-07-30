package com.multithreading.itc;
//WAP to show wait() ,notify1(),notifyAll() used in the Synchronized area other wise we will get the java.lang.IllegalMonitorStateException.
public class WaitNotifyNotifyALLMethodMustUseInSychronizationArea  extends Thread
{

	public static void main(String[] args) throws InterruptedException 
	{ 
		Object obj= new Object();
		
		synchronized (obj)  {
		    obj.wait(); //java.lang.IllegalMonitorStateException
		      
	}

	}

}
