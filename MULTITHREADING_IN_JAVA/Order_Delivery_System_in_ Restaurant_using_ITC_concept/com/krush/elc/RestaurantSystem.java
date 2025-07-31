package com.krush.elc;
import java.util.Scanner;
import com.krush.blc.Chef;
import com.krush.blc.Restaurant;
import com.krush.blc.Waiter;

public class RestaurantSystem {

	public static void main(String[] args) throws InterruptedException 
	{ 
		String[] vegMainus = {
			    "Paneer Butter Masala",
			    "Veg Kolhapuri",
			    "Dal Tadka",
			    "Jeera Rice",
			    "Butter Naan"
			};
		double [] vegMainuPrices= {120.00,190.00,100.00,70.00,40.00};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Restaurant Name : ");
		String name = sc.nextLine();
		
		Restaurant restaurant = new Restaurant(name);
		
		
		System.out.println("Welcome to "+restaurant.getRestaurantName()+" Restaurant!!!");
		
//		System.out.println("----------- Menu----------\n "
//				+ "1 :Jira Rice\r\n"
//				+ "2  :Fried Rice\r\n"
//				+ "3  :Paneer Butter Masala\r\n"
//				+ "4  :Veg Kolhapuri\r\n"
//				+ "5  :Butter Naan (2 pcs)");
		  System.out.println("-----------------Manu-----------------");
		System.out.println("item name                  price");
		for(int i=0;i < vegMainuPrices.length;i++) {
			
			System.out.printf("%-25s   %.2f \n",vegMainus[i],vegMainuPrices[i]);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.print("select food : ");
		
		
		int choice= Integer.parseInt(sc.nextLine());
		if(choice >5) {
			System.err.println("Invalid input ");
			System.exit(0);
		}

		System.out.println("---------------------------------------------------------------------------");
		String order = vegMainus[choice-1];
//		switch(choice)
//		{
//		case 1->  order="Jira Rice";
//		
//		case 2-> order="Fried Rice";
//		case 3-> order="Paneer Butter Masala";
//		case 4-> order="Veg Kolhapuri";
//		case 5->order ="Butter Naan (2 pcs)";
//		case 6->{   System.out.println("Invalid choice..");
//			System.exit(choice);
//		}
//		}
		
		
		Waiter waiterThread= new Waiter(restaurant,order);
		
		Chef chefThread = new Chef(restaurant);
		
		
		waiterThread.start();
		Thread.sleep(2);
		
		chefThread.start();

		waiterThread.join();

		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Item name: "+order+"\nTotal bill : "+vegMainuPrices[choice-1]);
       
		sc.close();
	}

}
/*
Jira Rice
Fried Rice
Paneer Butter Masala
Veg Kolhapuri
Butter Naan (2 pcs)
*/