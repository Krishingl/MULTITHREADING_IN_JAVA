package com.krush.synchronization.test_cases;

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
        for (int i = 1; i < 1000000; i++) 
	{
            number++;
        }
    }
    public Integer getNumber() 
    {
        return number;
    }
}
public class Test67 {
    public static void main(String[] args) {
        Job thread = new Job();
        thread.start();
		try
		{
			thread.join();//main thread are waiting to completing the thread  of thread
		}
		catch (Exception e)
		{
		}
        System.out.println(thread.getNumber());//999999
    }
}
