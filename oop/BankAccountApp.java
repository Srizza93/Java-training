package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account ->> think, instantiate an object
		
		BankAccount acc1 = new BankAccount();
		// acc1.name = "Roger Hue";
		// With Encapsulation
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("49350030");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.balance = 10000;
		acc1.accountNumber = "8503053484";
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(2300);
		acc1.deposit(230);
		acc1.withdraw(20000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		/*
		 * 
		 //Polymorphism through overloading
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "5850383308";
		
		BankAccount acc3 = new BankAccount("Saving Account", 890);
		acc3.accountNumber = "230838038";
		acc3.checkBalance();
		
		System.out.println(acc1.routingNumber);
		
		System.out.println(acc2.routingNumber);
		
		System.out.println(acc3.routingNumber);
		
		// Demo for inheritance
		
		CDaccount cd1 = new CDaccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.interestRate = "4.5";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
		
		

	}

}
