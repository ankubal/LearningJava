package cruiseboking1;

import java.util.Scanner;

public class CruiseBooking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LoginSystem system = new LoginSystem();
		CruiseDetails[] cruises = { new ScenicCruise("Scenic Cruise", 43.99, 12.99, 3),
				new SunsetCruise("Sunset Cruise", 52.99, 15.99, 1),
				new DiscoveryCruise("Discovery Cruise", 39.99, 9.99, 4),
				new MysteryCruise("Mystery Cruise", 45.99, 12.99, 2) };

		System.out.println("Welcome to Cruise booking!");
		System.out.println("Please sign up to book a cruise.");
		while (true) {
			System.out.println("Welcome to the Cruise login system!");
			System.out.println("1. sign Up");
			System.out.println("2. Log In");
			System.out.println("3. Exit");
			System.out.println("Choose an option: ");
			int option = input.nextInt();
			input.nextLine();

			switch (option) {
			case 1:
				system.signUp(input);
				system.logIn(input);
				system.cruiseOrHotel(input);
				system.cruiseSelection(input, cruises);
				break;
			case 2:
				
				system.logIn(input);
				if (system.loggedInUser != null) {
					system.cruiseSelection(input, cruises);
				}
				break;
			case 3:
				System.out.println("Thank you for using the cruise booking system");
				System.exit(0);

			default:
				System.out.println("Invalid option. Please choose again.");
				break;
			}

			System.out.println("Thank you for using our Cruise Booking system!");
			break;

		}
	
		input.close();
	}
}