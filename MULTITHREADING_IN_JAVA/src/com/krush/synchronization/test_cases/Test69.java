package com.krush.synchronization.test_cases;

public class Test69 extends Thread {

    public static void main(String[] args) throws Exception {
    Test69 t = new Test69();
    t.start();
    t.method();//
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}
