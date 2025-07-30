package com.krush.synchronization.test_cases;

class MyThread extends Thread 
{
public void run() 
{
		for (int i=0; i < 10; i++) 
		{
			System.out.println("hello world1");
		}
	}
}
public class Test36
{
public static void main(String [] args) //Mean thread created and started also 
{
MyThread t1 = new MyThread();// Child thread are created 
t1.start();   //child thread are in Runnable start waiting for Thread Shedular for CPU time 
try 
{
t1.join(); //main thread waiting for completing the t1 thread means child thread
} 
catch (InterruptedException e) 
{
System.out.println("ERROR: Thread was interrupted");
}       
System.out.println("Thread is done!");
	}
}
/*
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
Thread is done!

 */

