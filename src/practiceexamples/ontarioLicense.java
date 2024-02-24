package practiceexamples;

import java.util.Scanner;

public class ontarioLicense {
int age ;
String curentLicenseType, alreadyHolder = "NULL";
Scanner sc = new Scanner(System.in);
public void findlicensetype() {
	if (alreadyHolder.equals("yes")) {
		System.out.println("enter your current license: nG1\nG2\nG&& enter your age");
		curentLicenseType = sc.next();
		//age= sc.nextInt();
		if (curentLicenseType.equals("G1")) {
			System.out.println("YOU CAN APPY FOR G OR G2");
		}
			else if (curentLicenseType.equals("G2")) {
				System.out.println("you can apply for G");
			}
			else {
				System.out.println("invalid license type");
			}
		}
	
	else {
		System.out.println("enter your age");
		age = sc.nextInt();
		if (age>=16) {
			System.out.println("you are eligible for G1");
		
		}
		else {
			System.out.println("invalid age");
		}
		
	}


	
}
}
