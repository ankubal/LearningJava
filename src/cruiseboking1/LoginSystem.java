package cruiseboking1;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SwingContainer;

public class LoginSystem {

	public ArrayList<UserDetails> registeredUsers = new ArrayList<>();
	
	public String currentUser = null;;
	int userCount = 0;
	Scanner input = new Scanner(System.in);
   
	public UserDetails loggedInUser = null;

	public void signUp(Scanner input) {

		System.out.println("Enter your Email: ");
		String email = input.nextLine();
		System.out.println("Enter your password: ");
		String password = input.nextLine();
		System.out.println("Enter your name: ");
		String fullName = input.nextLine();
		System.out.println("Enter your phone number: ");
		String phoneNumber = input.nextLine();

		UserDetails newuser = new UserDetails(email, password, fullName, phoneNumber);
		registeredUsers.add(newuser);
		userCount++;
		
		System.out.println(fullName + "Registered successfully");
		
	}

	public void logIn(Scanner input) {
		System.out.println("Enter your Email: ");
		String loginEmail = input.nextLine();
		System.out.println("Enter your password: ");
		String loginPassword = input.nextLine();
		
		boolean loggedIn = false;

		for (UserDetails users : registeredUsers) {

			if (users.getEmail().equalsIgnoreCase(loginEmail) && users.getPassword().equals(loginPassword)) {
				loggedIn = true;
				loggedInUser = users;
				System.out.println("Logged in successfully as " + loggedInUser.getFullName());
				break;
			}
		}
		if (!loggedIn) {
			System.out.println("Login failed ");
		}
	}

	public void cruiseSelection(Scanner input, CruiseDetails[] cruises) {
		System.out.println("We offer " + cruises.length
				+ " different packages as displayed below. please enter the cruise you want to select.");

		for (CruiseDetails cruiseDetails : cruises) {
			System.out.println(cruiseDetails.getCruiseName());
		}
		boolean continueBooking = true;

		while (continueBooking) {
			CruiseDetails selectedCruise = null;
			System.out.println("Enter the cruise name: ");
			String selectedCruiseName = input.nextLine();

			for (CruiseDetails cruiseDetails : cruises) {
				if (selectedCruiseName.equals(cruiseDetails.getCruiseName())) {

					selectedCruise = cruiseDetails;
					break;
				}
			}

			if (selectedCruise != null) {
				System.out.println("The cruise that you selected is " + selectedCruise.getCruiseName() + "  which is a "
						+ selectedCruise.getDays() + " days cruise");
				System.out.println("Price for Adult (>12): $" + selectedCruise.getAdultPrice() + " per day");
				System.out.println("Price for Children (>5): $" + selectedCruise.getChildPrice() + " per day");
				System.out.println("Children below 5 can avail free services:");
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another: ");
				String continueChoice = input.nextLine();

				if (!continueChoice.equalsIgnoreCase("Y")) {
					continueBooking = false;
				} else {

					System.out.println("Enter the number of adults: ");
					int adults = input.nextInt();

					System.out.println("Enter the total number children: ");
					int totalChildren = input.nextInt();
					System.out.println("Enter the age of children less than 5: ");
					int childlessthan5 = input.nextInt();

					int[] child5 = new int[childlessthan5];
					for (int i = 0; i < childlessthan5; i++) {
						child5[i] = input.nextInt();
					}

					System.out.println("Enter the number of children (>5): ");
					int children = input.nextInt();

					input.nextLine();

					int[] childAges = new int[children];
					for (int i = 0; i < children; i++) {
						childAges[i] = input.nextInt();
					}

					input.nextLine();

					System.out.println(
							"All our cruises have food services on board.Do you want to pre-book for dinner meals? (yes/no): ");
					String mealChoice = input.next();
					boolean meals = mealChoice.equalsIgnoreCase("yes");

					double totalPrice = selectedCruise.calculatePrice(adults, children, meals);
					double tax = totalPrice * 0.15;
					double finalPrice = totalPrice + tax;

					System.out.println("\nYour package include: ");
					System.out.println("The " + selectedCruise.getCruiseName() + " booked for " + adults
							+ " Adults for " + selectedCruise.getDays() + " days @ : $"
							+ adults * selectedCruise.getAdultPrice() * selectedCruise.getDays());
					System.out.println(childlessthan5 + " Children below 5 can avail free services. you have total of "
							+ totalChildren + " children");
					System.out.println("The " + selectedCruise.getCruiseName() + " booked for " + children
							+ " Children above 5 @ : $"
							+ children * selectedCruise.getChildPrice() * selectedCruise.getDays());

					if (meals) {
						System.out.println("Buffet special Price for " + adults + " Adults is : $"
								+ adults * 20.99 * selectedCruise.getDays());
						System.out.println("Buffet special Price for " + children + " children above 5 is : $"
								+ children * 4.99 * selectedCruise.getDays());
					}

					System.out.println("Total Price: $" + totalPrice);
					System.out.println("Tax @ 15%: $" + tax);
					System.out.println("Final Price: $" + finalPrice);
				}
				break;

			} else {
				System.out.println("Invalid cruise name.please select a valid cruise.");

			}
		}
	}

}
