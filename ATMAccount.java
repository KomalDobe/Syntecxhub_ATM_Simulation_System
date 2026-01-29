package atm;

public class ATMAccount {


	    private int balance;
	    private int pin;

	    public ATMAccount(int balance, int pin) {
	        this.balance = balance;
	        this.pin = pin;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public int getPin() {
	        return pin;
	    }

	    public void deposit(int amount) {
	        balance += amount;
	    }

	    public boolean withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }
	}


