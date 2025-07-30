package com.krush.synchronization.test_cases;

public class Test4
{
public static void main(String argv[])
{
	Test pm1 = new Test("One");//One thread Object created but thread not started 
	pm1.run();//here not thread started only its method calling
	
	
	Test pm2 = new Test("Two");//Two thread Object created but thread not started 
	pm2.run();

}
}
class Test extends Thread
{
private String sTname="";
Test(String s)
{
	sTname = s;

}
public void run()
{
for(int i =0; i < 5 ; i++)
{
try
{
sleep(1000);
}
catch(InterruptedException e)
{}
Thread.yield();
System.out.println(sTname);
}

}
}