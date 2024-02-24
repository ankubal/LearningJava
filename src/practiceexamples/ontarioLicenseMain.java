package practiceexamples;

import java.util.Scanner;

public class ontarioLicenseMain {
	
	public static void main(String[] args) {
		ontarioLicense type = new ontarioLicense();
		try(Scanner sc  = new Scanner(System.in)){
			
			System.out.println("do you have any level of licese");
			type.alreadyHolder = new Scanner(System.in).next();
		
		type.findlicensetype();

	}
	}
}
