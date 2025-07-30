package com.krush.synchronization.test_cases;

class Test70 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() {
 public void run() {
 System.out.print("Cat");
 }
 };
 Thread t = new Thread(r) {
 public void run() {
 System.out.print("Dog");//Dog
 }
 };
 t.start();
		
	}
}
//Dog