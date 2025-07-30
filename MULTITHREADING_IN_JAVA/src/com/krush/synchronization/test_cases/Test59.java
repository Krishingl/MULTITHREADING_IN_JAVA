package com.krush.synchronization.test_cases;

public class Test59
{
public static void main(String [] args) 
{
      myRunnable r = new myRunnable(); 

      Thread t1 = new Thread();
      Thread t2 = new Thread();

      t1.setName("Thread One");
      t2.setName("Thread Two");

      t1.start();
      t2.start();

      System.out.println("Mains Thread: " + Thread.currentThread().getName());//Mains Thread: main
   }
}

class myRunnable implements Runnable 
{
public void run() 
{
      for ( int i = 1; i < 4; i++) 
      System.out.println("Thread: " + Thread.currentThread().getName());
}
}