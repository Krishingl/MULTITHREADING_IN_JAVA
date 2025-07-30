package com.krush.synchronization.test_cases;

class Test62 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread-1 running");
        });

        t1.start();//Thread-1 running
        t1.join();
        t1.start();//IllegalThreadStateException
    }
}