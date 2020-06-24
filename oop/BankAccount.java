package oop;

public class BankAccount implements IRate {	
	// Define variables
	String accountNumber;
	
	// static >> belongs to the class not the OBJECT instance
	// final >> constant (often final static)
	private static final String routingNumber = "048082"; // final is a constant. You can't change the number
	
	// instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// IMPORTANT FOR INTERVIEW (WHAT ARE CONSTRUCTORS)
	// Constructor definitions: unique methods
	      // 1. They are used to define / setup / initialize properties of an object
	      // 2. Constructors are IMPLICITY called upon INSTANTIATION
	      // 3. The same name as the class itself
	      // 4. Constructors have no return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
		
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: €" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: minimum deposit must be at least 1000.00€";
		} else {
			Msg = ("Thanks for your intial deposit of €" + initDeposit);
		}
		
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters
	
	// Allow the user to define the name	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return "Mr. " + name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}
	

	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");

	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
		
	}
	
	// Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: €" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING#" + routingNumber + ". BALANCE: €" + balance + " ]";
	}

}
