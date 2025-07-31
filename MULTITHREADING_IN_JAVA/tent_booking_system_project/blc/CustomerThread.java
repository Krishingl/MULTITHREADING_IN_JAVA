package blc;

public class CustomerThread extends Thread
{
	TentBookingSystem system;
	String name;
	public CustomerThread(TentBookingSystem system, String name) {
		super();
		this.system = system;
		this.name = name;
	}
	
	
	
public void run() {
	
	system.bookTent(name);
	
}




}
