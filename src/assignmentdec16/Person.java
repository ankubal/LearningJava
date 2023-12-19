package assignmentdec16;

public class Person {
	private String accountNumber;
    private String accountHolderName;
    private String pin;
    private OnlineBanking onlineBanking;

    public Person(String accountNumber, String accountHolderName, double initialDeposit, String pin, String onlineBankingPassword) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.onlineBanking = new OnlineBanking(initialDeposit, onlineBankingPassword);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getPin() {
        return pin;
    }
    
		
			
    public OnlineBanking getOnlineBanking() {
        return onlineBanking;
    }
}
 