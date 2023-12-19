package assignmentdec16;

public class BankOperations {

private double balance;

public BankOperations(double initialDeposit) {
    this.balance = initialDeposit;
}

public void deposit(double amount) {
    balance += amount;
}

public void withdraw(double amount) {
    if (amount > balance) {
        System.out.println("Insufficient funds. Withdrawal failed.");
    } else {
        balance -= amount;
    }
}

public double viewBalance() {
    return balance;
}
}
//public BankOperations(double withdraw, double viewBalance) {
//	this.withdraw = withdraw ;
//	
//	this.viewBalance = viewBalance;
//}
//public BankOperations(double deposit) {
//	this.deposit = deposit;
//}
//public double getWithdraw() {
//	
//	viewBalance -= withdraw;
//    System.out.println("Balance after withdraw: "
//                       + viewBalance);
//	return viewBalance;
//}
//
//
//
//public void setWithdraw(double withdraw) {
//	this.withdraw = withdraw;
//}
//public void setDeposit(double deposit) {
//	this.deposit = deposit;
//}
//public void setViewBalance(double viewBalance) {
//	this.viewBalance = viewBalance;
//}
//public double getDeposit() {
//	viewBalance += deposit;
//     System.out.println("Balance after deposit: "
//                       + viewBalance);
//	return viewBalance ;
//}
//
//public double getViewBalance() {
//	
//	System.out.println( viewBalance);
//	return viewBalance;
//}
//
//
//
//}
