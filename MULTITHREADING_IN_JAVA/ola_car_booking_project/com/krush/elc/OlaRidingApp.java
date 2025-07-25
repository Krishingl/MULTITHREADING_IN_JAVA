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
             fareCal.start();
             
             rideReq.join();
             
//             fareCal.join();
             
             driverAssign.start();
              driverAssign.join();
            
             
             
             
           // Live Tracking or Updation 
             liveTrac.start();
             liveTrac.join();
             
             
             //Payment Process Start Here...
             paymentProcess.start();
             paymentProcess.join();
             
             
             //FeedBack  Process Start Here...
             ratingSys.start();
             
             
             
             
             
             
             
             
             
             
	}

}
