package com.krush.synchronization.test_cases;

public class Test3 extends Thread
{
static String sName = "good";
public static void main(String argv[]) 
{
Test3 t = new Test3();//Thread object created

t.nameTest(sName);

System.out.println(sName);  //  good idea
}

public void nameTest(String sName)
{
this.sName = sName + " idea ";  //good idea
start(); 
}

public void run()
{
for(int i=0; i<4; i++)
{
 sName = sName + " " + i; // good idea 0...3
}
}

}