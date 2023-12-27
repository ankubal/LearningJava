package assignmentbank16;

public class OnlineBanking extends BankOperations {


			 private String onlineBankingPassword;

			    public OnlineBanking(double initialDeposit, String onlineBankingPassword) {
			        super(initialDeposit);
			        this.onlineBankingPassword = onlineBankingPassword;
			    }

			    public boolean validatePassword(String enteredPassword) {
			        return onlineBankingPassword.equals(enteredPassword);
			   
//			        String modeOfUse = "Online";
//					boolean isValidUser = false;
//					isValidUser = modeOfUse.equals("ATM") ? person.validateUser("1234567", 1234)
//							: person.validateUser("admin", "Admin123");
//
//					System.out.println("Is User Validated: " + isValidUser);}

			    }		    
	
}




