package assignmentdec16;

public class Person {
	private String accountNumber;
    private String accountHolderName;
    private int pin;
    private OnlineBanking onlineBanking;

    public Person(String accountNumber, String accountHolderName, double initialDeposit, int pin, String onlineBankingPassword) {
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

    public int getPin() {
        return pin;
    }
    
		
			
    public OnlineBanking getOnlineBanking() {
        return onlineBanking;
    }
}
