package exceptionsfiles;

public class NegativePaymentExceptions extends Exception {
	// Define class variable
	double payment;
	
	// 1. Constructor that takes the value that would throw the exception
	// 2. Assign value of local variable class variable
	public NegativePaymentExceptions(double payment) {
		this.payment = payment; // this (class variable) is equal to local variable
		
	}
	
	// 3. Override the toString() method to include the specific exception message
	public String toString() {
		return "ERROR: Cannot take negative payment " + payment;
		
	}

}
