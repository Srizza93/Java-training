package oop;

public class CDaccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compount() {
		System.out.println("Compounding Interest");
	}

}
