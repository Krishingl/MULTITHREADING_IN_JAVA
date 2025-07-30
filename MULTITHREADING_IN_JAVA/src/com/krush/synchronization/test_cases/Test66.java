package com.krush.synchronization.test_cases;

public class Test66 extends Thread 
{
static String name = "ravi";

public static void main(String args[]) 
{
Test66 t = new Test66();
t.Test66(name);
System.out.print(" " + name);
}

public  void Test66(String name) {
start();
System.out.print(" method");
}

public void run() {
System.out.print(" run");
}
}

// method run ravi