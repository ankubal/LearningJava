package assignmentbank16;

public class OnlineBanking extends BankOperations {


			 private String onlineBankingPassword;

			    public OnlineBanking(double initialDeposit, String onlineBankingPassword) {
			        super(initialDeposit);
			        this.onlineBankingPassword = onlineBankingPassword;
			    }

			    public boolean validatePassword(String enteredPassword) {
			        return onlineBankingPassword.equals(enteredPassword);
			    }

			    
	
	}


