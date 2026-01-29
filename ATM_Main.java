package atm;
import java.util.Scanner;

public class ATM_Main {
	
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ATMAccount user = new ATMAccount(1000, 1234);
	        ATMAccount receiver = new ATMAccount(500, 4321);

	        ATMOperations ops = new ATMOperations(user);

	        int choice;

	        while (true) {
	            System.out.println("\n---- ATM MENU ----");
	            System.out.println("1. View Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Transfer");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    ops.viewBalance();
	                    break;

	                case 2:
	                    System.out.print("Enter amount: ");
	                    int wAmt = sc.nextInt();
	                    System.out.print("Enter PIN: ");
	                    int wPin = sc.nextInt();
	                    ops.withdraw(wAmt, wPin);
	                    break;

	                case 3:
	                    System.out.print("Enter amount: ");
	                    int dAmt = sc.nextInt();
	                    ops.deposit(dAmt);
	                    break;

	                case 4:
	                    System.out.print("Enter amount: ");
	                    int tAmt = sc.nextInt();
	                    System.out.print("Enter PIN: ");
	                    int tPin = sc.nextInt();
	                    ops.transfer(tAmt, receiver, tPin);
	                    break;

	                case 5:
	                    System.out.println("Thank you for using ATM.");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}



