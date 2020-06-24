package assignement4CreditCardStatement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "/Users/martina/eclipse-workspace/JavaTraining/Files/statements.csv";
		String dataRow;
		double balance = 0;
		
		try {
			// 1. Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// 2. Read the data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas ","
				String[] line = dataRow.split(",");
				// Add the data to the collection
				transactions.add(line);
			}
			br.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.println("DATE  | TRANSACTION | VENDOR | AMOUNT | BALANCE");
		for (String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " | " + type + " | " + vendor + " | €" + amount + " |");
			if (type.equalsIgnoreCase("credit")) { // equalsIgnoreCase is useful when word can be written in 
				balance = balance + amount;
				//System.out.println("Add to balance");// different formats as: Credit, CREDIT, credit etc.
			}
			else if (type.equalsIgnoreCase("debit")) {
				balance = balance - amount;
				//System.out.println("Subtract from balance");
			}
			else {
				balance = balance - amount;
				//System.out.println("Some other transaction");
			}
			System.out.print(" €" + balance + "\n");

		}
		//Check the balance
		if (balance > 0) {
			System.out.println("You have a balance of €" + balance);
			System.out.println("You are charged a 10% fee of €" + balance*.10);
			System.out.println("Your new balance is: €" + balance*1.1);
		}
		else if (balance < 0) {
			System.out.println("Thank's for your payment");
			System.out.println("You have a overpayment of -€" + balance);
		}
		else {
			System.out.println("Thank's for your payment");
		}

	}
	

}
