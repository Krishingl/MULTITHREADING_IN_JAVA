package com.krush.elc;
import com.krush.blc.DriverAssignment;
import com.krush.blc.FareCalculation;
import com.krush.blc.LiveTracking;
import com.krush.blc.PaymentProcessing;
import com.krush.blc.RatingSystem;
import com.krush.blc.RideRequest;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException 
	{
             RideRequest rideReq= new RideRequest();
             DriverAssignment driverAssign = new DriverAssignment();
             FareCalculation  fareCal = new FareCalculation();
             LiveTracking    liveTrac = new LiveTracking();
             PaymentProcessing   paymentProcess=new  PaymentProcessing();
             RatingSystem  ratingSys= new RatingSystem();
             
             rideReq.start();
             
             driverAssign.start();
             fareCal.start();
                 
             driverAssign.join();
             liveTrac.start();
             
             liveTrac.join();
             paymentProcess.start();
             paymentProcess.join();
             
             ratingSys.start();
             
             
             
             
             
             
             
             
             
             
	}

}
