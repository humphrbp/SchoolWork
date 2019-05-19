
import java.util.Scanner;

public class FlyersCommand {

	public static void main(String[] args)
	{
		
		//Get Take-out or Delivery//
		int a = 0;
		Scanner Order = new Scanner(System.in); 
		do {
			System.out.println(" Take Out(1) or Delivery(2)?: ");
			while (!Order.hasNextInt()) 
				{
					System.out.println("Please enter 1 for Take Out of 2 for Delivery") ;
					Order.next();	
				}
				a = Order.nextInt(); 
		 	}
		 	while (a >2 || a < 1 );
		
		int Cost_Delivery = 0;

		//If Delivery Prompt for Zip Code//
		if (a==2)
			{
			int b = 0;
			do {
				System.out.println("What is your Zip Code?: ");
				while (!Order.hasNextInt())
					{System.out.println("Please enter a valid zip code");
					Order.next();
					}
					 b = Order.nextInt();
				}
				while (b < 0 ||b >99999 );
			
			if (b < 60450 && b > 60442)
				{System.out.println ("Delivery Available");
				Cost_Delivery = 5; 	}
			else if (b ==60450 || b ==60442) 
				{System.out.println ("Delivery Available with Extra Cost");
				Cost_Delivery = 7;  }
			else 
				{System.out.println("Delivery not Available - Order has been switched to Take Out");
				a = 1;
				; 	}
			}
		else
			{System.out.println("Great Takeout it is.");
	
			};
		
	//*Get Fries Quantity//
		int c = 0;
		do {
			System.out.println("How may Fries do you want?: ");
			while (!Order.hasNextInt())
			{System.out.println("Please enter a quantity between 0 and 100");
			Order.next();
			}
			 c = Order.nextInt();
		}
		while (c < 0 ||c >100 );


	//*Get Burgers Quantity//
		int d = 0;
		do {
			System.out.println("How may Burgers do you want??: ");
			while (!Order.hasNextInt())
			{System.out.println("Please enter a quantity between 0 and 100");
			Order.next();
			}
			 d = Order.nextInt();
		}
		while (d < 0 ||d >100 );
	
		
	//*Get Drinks Quantity//
		int e = 0;
		do {
			System.out.println("How may Drinks do you want??: ");
			while (!Order.hasNextInt())
			{System.out.println("Please enter a quantity between 0 and 100");
			Order.next();
			}
			 e = Order.nextInt();
		}
		while (e < 0 ||e >100 );
		
		
	//*Get Desserts Quantity//
		int f = 0;
		do {
			System.out.println("How may Desserts do you want??: ");
			while (!Order.hasNextInt())
			{System.out.println("Please enter a quantity between 0 and 100");
			Order.next();
			}
			 f = Order.nextInt();
		}
		while (f < 0 ||f >100 );
					
		
		Order.close();
	
	
		double Total_Bill = (c*4.5 + d*1.5+e*2.5+f*3)*1.05  + Cost_Delivery;
		System.out.println("Delivery Cost: $" + String.format("%.2f",1.00*Cost_Delivery));
		System.out.println("Fries:" + c + "@ $2.50 = $" + String.format("%.2f",2.50*c));
		System.out.println("Burgers:" + d + "@ $4.50 = $" + String.format("%.2f",4.50*d));
		System.out.println("Drinks:" + e + "@ $1.50 = $" + String.format("%.2f",1.50*e));
		System.out.println("Desserts:" + f + "@ $3.00 = $" + String.format("%.2f", 3.00*f));
		System.out.println("Tax: $" + String.format("%.2f", (c*4.5 + d*1.5+e*2.5+f*3)*.05));
	    System.out.println("Your Total Bill is $" + String.format("%.2f", Total_Bill) );
	}


}
