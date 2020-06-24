package BankAccountAppCourse;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("453925296", 1000.50);
		BankAccount acc2 = new BankAccount("467684532", 2000);
		BankAccount acc3 = new BankAccount("235544353", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());


		
	}

}


class BankAccount implements IInterest {
	// Properties of bank account
	private static int ID = 1001; // Internal ID / static because we want this to belong to the call and not a particular person
	private String accountNumber; // ID + random 2 digits number + first 2 SSN
	private static final String routingNumber = "005400657"; // final needs to block modification. routingNumber cannot be changed. static is to be used in classes
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors: call formulas for all accounts generated
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++; // It creates a new ID number everytime we create a bank account
		setAccountNumber();
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100); // Math.random alone, generates a random number between 1 and 0		             
		accountNumber = ID + "" + random + SSN.substring(0, 2); // If you multiply for 100 you'll get 2 digits, if multiplied 10 1 digits.
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	@Override
	public String toString() {
		return "[Name: " + name +" ]\n[Account number: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" +"[Balance: " + balance + "]";
		
	}
	
} 