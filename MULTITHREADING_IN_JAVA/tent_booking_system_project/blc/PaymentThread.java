package blc;

public class PaymentThread extends Thread 
{
	TentBookingSystem system;
	String name;
	public PaymentThread(TentBookingSystem system, String name) {
		super();
		this.system = system;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		
		system.makePayment(name);
	}

}
