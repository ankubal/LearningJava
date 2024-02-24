package cruiseBooking;

import java.util.Scanner;

public class UserDetails {

	private String email;
	private String password;
	private String fullName;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword() 
    {
        if(this.password==oldpassword)
        {
            this.password=newpassword;
            System.out.println("Password is changed");
        }
        else
        {
            System.out.println("password mismatch");
        }
		
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
		this.phoneNumber = phoneNumber;
	}

}