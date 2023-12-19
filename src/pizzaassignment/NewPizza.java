package pizzaassignment;

import java.util.Scanner;

public class NewPizza {
		
		public static final String SMALL_PIZZA = "Small Pizza";
		public static final String MEDIUM_PIZZA = "Medium Pizza";
		public static final String LARGE_PIZZA = "Large Pizza";



		public void orderPizza() {
			Scanner pizzaDepot = new Scanner(System.in);

			System.out.println("Welcome to Pizza Depot!");
			System.out.println("Please enter the Size of pizza:");
			System.out.println("Enter 1 for Small pizza");
			System.out.println("Enter 2 for Medium pizza");
			System.out.println("Enter 3 for Large pizza");

			int pizzaSizeChoice = pizzaDepot.nextInt();
			double basePrice = 0;
			boolean choice = false;
			String pizzaSize = null; 

			switch (pizzaSizeChoice) {
			case 1:
				pizzaSize = SMALL_PIZZA;
				basePrice = 15;
				choice = true;
				break;
			case 2:
				pizzaSize = MEDIUM_PIZZA;
				basePrice = 20;
				choice = true;
				break;
			case 3:
				pizzaSize = LARGE_PIZZA;
				basePrice = 25;
				choice = true;
				break;
			default:
				System.out.println("Invalid choice.");
				System.exit(0);
			}

			if (!choice) {
				System.out.println("Please choose a valid entry");
			}

			
 
			System.out.println("Do you want pepperoni topping?(Yes/No)");
			String pepperoniChoice = pizzaDepot.next();
			double toppingPrice = 0;

			if (pepperoniChoice.equalsIgnoreCase("yes")) {
				if (pizzaSizeChoice == 1) {
					toppingPrice = 2;
				} else if (pizzaSizeChoice == 2 || pizzaSizeChoice == 3) {
					toppingPrice = 3;
				} else {
					System.out.println("Invalid pizza size for pepperoni topping");

				}
				System.out.println(" Price of topping you selected is : $" + toppingPrice);
			}

			System.out.println("Do you want extra cheese?(Yes/No)");
			String cheeseChoice = pizzaDepot.next();
			double cheesePrice = 0;

			if (cheeseChoice.equalsIgnoreCase("yes")) {
				cheesePrice = 1;
				System.out.println("Price of extra cheese is: $ " + cheesePrice);

			}

			double finalBill = basePrice + toppingPrice + cheesePrice ;
			if (finalBill > 0) {
				System.out.println("Final price of your pizza after tax " + pizzaSize + " pizza is: $" + finalBill);
			} else {
				System.out.println("Invalid order. Please make a valid selection.");
			}
			pizzaDepot.close();
		}
		

		
	}

