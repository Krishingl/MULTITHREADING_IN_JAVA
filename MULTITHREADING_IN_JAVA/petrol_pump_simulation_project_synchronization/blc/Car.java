package blc;

public class Car implements Runnable {

	private String carName;
	private PetrolPump petrolPump;
	 
	public Car(String carName,PetrolPump petrolPump) {
		this.petrolPump=petrolPump;
		
		this.carName=carName;
	}
	
	
	@Override
	public void run() {
		
		petrolPump.refillCar(carName);
		
		
		System.out.println("Next Car come Please..");
	}

}
