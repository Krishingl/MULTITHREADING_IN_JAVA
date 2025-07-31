package elc;


import blc.CustomerThread;
import blc.PaymentThread;
import blc.TentBookingSystem;

public class MainBooking {

	public static void main(String[] args) {
		TentBookingSystem system = new TentBookingSystem();
		
		// Simulating a customer and payment process
        CustomerThread customer = new CustomerThread(system, "Krushna");
        PaymentThread payment = new PaymentThread(system, "Krushna");

        customer.start();
        payment.start();

	}

}
