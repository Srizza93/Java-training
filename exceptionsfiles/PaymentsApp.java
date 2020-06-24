package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
	
    // Take payment from user
	public static void main(String[] args) {
		double payment = 0;
		
		boolean positivPymt = true;
		
		
		
		do { // do loop to ask user to try again
			
			// 1. Ask the user for input
			System.out.print("Enter the payment amount: "); // So that it goes in same line with input, we print and not println
		
		    // 2. Get the amount and test the value
		    Scanner in = new Scanner(System.in);
			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentExceptions(payment);
				}
				else { // Without this else, in case you first mistake, but then guess, you won't get successful anymore
					positivPymt = true;
				}
					
			} catch (NegativePaymentExceptions e) {
				System.out.println(e.toString());
				System.out.println("Please try again");
				positivPymt = false;
			}
		
		} while(!positivPymt); // while ! different
		
		// 4. Print Confirmation
	    System.out.println("Thank you for your payment of €" + payment);
		
	}

}
