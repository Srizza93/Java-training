package assignement4CreditCardStatement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatement {

	public static void main(String[] args) {
		List<String[]> data = new ArrayList<String[]>();
		String filename = "/Users/martina/eclipse-workspace/JavaTraining/Files/statements.csv";
		String dataRow;	
		double balance = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			br.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		} catch (IOException e) {
			System.out.println("Can't read the file: " + filename);
		}
		System.out.println("DATE | TYPE | MERCH | AMOUNT");
		for (String[] account : data) {
			for (String field : account) {	
				System.out.print(field + " ");		
			}
			System.out.println("€");
			double amount = Double.valueOf(account[3]);
			    if (account[1].equals("CREDIT")) {
				        balance = balance + amount;
				        balance = Math.round(balance);
				        System.out.println("BALANCE: " + balance + "€");
			    }
			    else if (account[1].equals("DEBIT")) {
			    	    balance = balance - amount;
			    	    balance = Math.round(balance);
			        	System.out.println("Balance is: " + balance + "€");
			    }
		    }
		if (balance > 0) {
			balance = balance - (balance * 0.01);
        	System.out.println("\nAccount fee: 10%" + "\nFinal balance: " + balance + "€");
        }
		else if (balance < 0) {
			System.out.println("\nThank's for your payment" + "\nOverpayment: -" + balance + "€");
	     }
		else {
			System.out.println("\nThank's for your payment");
		}
	}
}
