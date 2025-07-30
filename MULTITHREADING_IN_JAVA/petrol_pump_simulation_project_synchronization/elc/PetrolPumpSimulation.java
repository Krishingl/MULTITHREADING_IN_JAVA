package elc;

import blc.Car;
import blc.PetrolPump;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException 
	{
		
		   
		PetrolPump pretrolPump = new PetrolPump();
        
		Car [] cars= {new Car("Ford",pretrolPump),new Car("Naxon",pretrolPump),new Car("Maruti",pretrolPump)};
		
		
		Thread[] carsThreads= {new Thread(cars[0]),new Thread(cars[1]),new Thread(cars[2])};
		
		
		
		
		    carsThreads[0].setPriority(1);
		     carsThreads[0].start();
		     carsThreads[1].start();
		     carsThreads[2].start();
//		for(Thread carThread : carsThreads )
//		{      
//			
//			carThread.start();
//			
//			carThread.join();
//			
//		}
//		
//		
		
		
	}

}
