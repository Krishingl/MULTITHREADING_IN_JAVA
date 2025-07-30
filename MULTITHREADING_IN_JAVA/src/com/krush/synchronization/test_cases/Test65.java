package com.krush.synchronization.test_cases;

class A implements Runnable 
{  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());//T1,T1,T3
  }  
}  
class B implements Runnable
{  
  public void run() 
  {  
    new A().run();  //T1
    new Thread(new A(),"T2").run(); //T1
    new Thread(new A(),"T3").start();//T3  
   }
}  
public class Test65
{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}
//T1T1T3