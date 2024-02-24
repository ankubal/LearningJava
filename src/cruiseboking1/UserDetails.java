package cruiseboking1;

import java.util.Scanner;

public class UserDetails {
	Scanner sc = new Scanner(System.in);
	private String email;
	private String password;
	private String fullName;
	private String UserName;
	private String phoneNumber;
	private String oldpassword;
	private String newpassword;

	public UserDetails(String email, String password, String fullName, String phoneNumber) {
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
	} 


	public String getEmail() {
		return email;
	}

	public void setEmail(String email, Object String, MyBookings mybookings) {
		 {
				while (!(email.contains("@")) || !(email.contains(".")) || email.endsWith(".")) {
					System.out.println("Please enter valid email address.");
					email = sc.next();
				}
				this.email = email;
		
	}
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) 
    {
		while (password.length() < 8 || !(password.contains("!")) && !(password.contains("@"))
				&& !(password.contains("#")) && !(password.contains("$")) && !(password.contains("%"))
				&& !(password.contains("^")) && !(password.contains("&")) && !(password.contains("*"))) {
			System.out.println(
					"Password not created. Please create a password which is 8 or more characters with atleast one special character from !,@,#,$,%,^,& or *.");
			password = sc.next();
		}
		this.password = password;
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		while (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
			System.out.println("Please enter a valid 10 digit phone number without any spaces or any other character.");
			phoneNumber = sc.next();
		}
		this.phoneNumber = phoneNumber;
	}
	

	


	public void SignIn(String SignInUserName, String SignInPassword, MyBookings mybookings) {
		while (!(SignInUserName.equals(getUserName())) || !(SignInPassword.equals(getPassword()))) {
			System.out.println("Incorrect details entered. "
					+ "\nIf you do not remember your user details, please enter your email address below on which we will email you your user details. "
					+ "\nOnce you log in with your details that we email to you, we recommend changing your username and password."
					+ "\nIf you remember your user details, please enter any alphabet and press enter");
			String emailIdToRecoverUserDetails = sc.next();
			if (emailIdToRecoverUserDetails.equals(getEmail())) {
				System.out.println("User details emailed. Please check your email and try again.");
			}

			System.out.println("Please enter username.");
			sc.nextLine();
			SignInUserName = sc.nextLine();
			System.out.println("Please enter password.");
			SignInPassword = sc.next();
		}

		if (SignInUserName.equals(getUserName()) && SignInPassword.equals(getPassword())) {
			System.out.println("Login Successful!");
		}
	}

	
	public String getUserName() {
		return UserName;
	}

	public boolean isPassWordValidated(String passwordToCheck, MyBookings mybookings) {
		for (int i = 0; i < 3; i++) {
			if (passwordToCheck.equals(getPassword())) {
				System.out.println("Password validated successfully.");
				break;

			} else if (i < 2) {
				System.out.println("Password incorrect. Please try again.Enter your password below.");
				passwordToCheck = sc.next();
				;
			}

			else {
				System.out.println(
						"There are 3 unsuccessful attempts to validate password and hence we can not change any personal details at this time.");
				;

			}
		}
		if (passwordToCheck.equals(getPassword())) {
			return true;
		} else {
			return false;
		}

	}

}