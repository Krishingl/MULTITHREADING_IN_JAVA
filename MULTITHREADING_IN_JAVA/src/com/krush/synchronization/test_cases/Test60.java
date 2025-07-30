package com.krush.synchronization.test_cases;


class Test60 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);//main
            }   
        });
        t.run();//only run method is calling and executed.
		
        System.out.println("Main thread finished");//1st output
    }
}
