package atm;

public class ATMOperations {
	
	 ATMAccount account;

	    public ATMOperations(ATMAccount account) {
	        this.account = account;
	    }

	    public void viewBalance() {
	        System.out.println("Current Balance: ₹" + account.getBalance());
	    }

	    public void deposit(int amount) {
	        if (amount > 0) {
	            account.deposit(amount);
	            System.out.println("Deposit Successful.");
	        } else {
	            System.out.println("Invalid Amount.");
	        }
	    }

	    public void withdraw(int amount, int pin) {
	        if (pin != account.getPin()) {
	            System.out.println("Incorrect PIN.");
	            return;
	        }

	        if (account.withdraw(amount)) {
	            System.out.println("Withdraw Successful.");
	        } else {
	            System.out.println("Insufficient Balance.");
	        }
	    }

	    public void transfer(int amount, ATMAccount receiver, int pin) {
	        if (pin != account.getPin()) {
	            System.out.println("Incorrect PIN.");
	            return;
	        }

	        if (account.withdraw(amount)) {
	            receiver.deposit(amount);
	            System.out.println("Transfer Successful.");
	        } else {
	            System.out.println("Insufficient Balance.");
	        }
	    }
	}
