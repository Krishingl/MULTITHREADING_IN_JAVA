package com.krush.synchronization.test_cases;

class Test55 extends Thread 
{
	static Thread tf, ts;

	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName()+""); //SCJP //SCJWD
		ts.start();  //IllegalThreadStateException
	}

	public static void main(String[] args) 
	{
		tf = new Thread(new Test55(),"SCJP");
		ts = new Thread(new Test55(),"SCJWD");
		tf.start();
	}

}