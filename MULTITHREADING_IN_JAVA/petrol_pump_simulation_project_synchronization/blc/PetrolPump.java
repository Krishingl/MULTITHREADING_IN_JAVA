package blc;

public class PetrolPump 
{      // A synchronized method simulating the refilling process. Ensure that only one car can execute this method at a time.
    public synchronized void refillCar(String carName) 
    {
    	
    	
    	try {
    		System.out.println("<"+carName+"> Car are Ready to come...");
    		Thread.sleep(2000);
    		
    		System.out.println("<"+carName+"> started refilling...");
    	Thread.sleep(3000);//to simulate the time it takes for a car to refill.
    	System.out.println("<"+carName+"> completed refilling!");
   
    	  
    	}
    	catch(InterruptedException e)
    	{
    		System.err.println(Thread.currentThread().getName()+" Thread are Interrupted");
    	}
    }
}
