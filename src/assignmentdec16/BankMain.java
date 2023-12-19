package assignmentdec16;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
        Person person = new Person("123456789", "akanksha", 1000, 1234, "pass123");

        Scanner scanner = new Scanner(System.in);
        
		System.out.println(" ");
        System.out.println("Enter your PIN:");
        String enteredPin = scanner.next();

        // Validate PIN
        if (enteredPin.equals(person.getPin())) {
        	System.out.println("valid user");
            System.out.println("Choose your banking service:");
            System.out.println("1. ATM");
            System.out.println("2. Online Banking");

            int bankingServiceChoice = scanner.nextInt();

            switch (bankingServiceChoice) {
                case 1:
                    performATMTransaction(person);
                    break;
                case 2:
                    performOnlineBankingTransaction(person);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Incorrect PIN. Transaction failed.");
        }

        scanner.close();
    }

    private static void performATMTransaction(Person person) {
        Atm atm = new Atm (person.getOnlineBanking().viewBalance());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your action:");
        System.out.println("1. Deposit cash");
        System.out.println("2. Withdraw cash");

        int actionChoice = scanner.nextInt();

        switch (actionChoice) {
            case 1:
                System.out.println("Enter the amount to deposit:");
                double depositAmount = scanner.nextDouble();
                atm.deposit(depositAmount);
                System.out.println("Deposit successful. New balance: $" + atm.viewBalance());
                break;
            case 2:
                System.out.println("Enter the amount to withdraw:");
                double withdrawAmount = scanner.nextDouble();
                atm.withdraw(withdrawAmount);
                System.out.println("Withdrawal successful. New balance: $" + atm.viewBalance());
                break;
            default:
                System.out.println("Invalid action choice.");
        }

        scanner.close();
    }

    private static void performOnlineBankingTransaction(Person person) {
        OnlineBanking onlineBanking = person.getOnlineBanking();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your online banking password:");
        String enteredPassword = scanner.next();

        // Validate online banking password
        if (onlineBanking.validatePassword(enteredPassword)) {
            System.out.println("Choose your action:");
            System.out.println("1. Deposit funds");
            System.out.println("2. Withdraw funds");

            int actionChoice = scanner.nextInt();

            switch (actionChoice) {
                case 1:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    onlineBanking.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + onlineBanking.viewBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    onlineBanking.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance: $" + onlineBanking.viewBalance());
                    break;
                default:
                    System.out.println("Invalid action choice.");
            }
        } else {
            System.out.println("Incorrect online banking password. Transaction failed.");
        }

        scanner.close();
    }

	
}