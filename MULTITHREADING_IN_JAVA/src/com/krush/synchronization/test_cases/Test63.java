package com.krush.synchronization.test_cases;

class Test63 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });

        t.start();
        t.run(); 
    }
}
//main is running
//Thread-0 is running