package passwordCriteriaAppPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordTrainingApp {

	public static void main(String[] args) {
		String filename = "/Users/martina/eclipse-workspace/JavaTraining/Files/PasswordFile.txt";
		String[] passwords = new String[13];
		File file = new File(filename);
		
		try {
			BufferedReader cr = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				
				passwords[i] = cr.readLine();
			}
			cr.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + filename);
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		}
		
		
		
		
		for (String password1 : passwords) {
			System.out.print("****\n" + password1 + "\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
				for (int n = 0; n < password1.length(); n++) {
					if ("0123456789".contains(password1.substring(n, n+1))) {
						hasNumber = true;
						//System.out.println("Position " + n + " contains a number");
					}
				
				    else if ("abcdefghijklmnopqrstuvwyxz".contains(password1.substring(n, n+1).toLowerCase())) {
				    	hasLetter = true;
						//System.out.println("Position " + n + " contains a letter");
					}
				
			        else if ("'@!#}{][-_;,:/+=)(*°&£€?'|^.$'".contains(password1.substring(n, n+1))) {
			        	hasSpecialChar = true;
						//System.out.println("Position " + n + " contains a special character");
					}
			        else {
			        	try { throw new InvalidCharacterException(password1.substring(n, n+1));} 
			        	catch(InvalidCharacterException e) { e.toString(); }
			        	
			        }
				}
				// Test and exception handling
				try {
				    if (!hasNumber) {throw new NumberCriteriaException(password1);}
				    else if (!hasLetter) {throw new LetterCriteriaException(password1);}
				    else if (!hasSpecialChar) {throw new SpecialCharCriteriaException(password1);} 
				    else { System.out.println("Valid password"); }
				    } catch(NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {  
				    	System.out.println("Invalid password");
				    	System.out.println(e.toString());
				    }
			} 	    
		}	      
}

class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException(String ch) {
		this.ch = ch;
		
	}
	public String toString() {
		return "InvalidCharacterException: " + ch;
	}
	
}
class NumberCriteriaException extends Exception {
	String password1;
	public NumberCriteriaException(String password1) {
		this.password1 = password1;
		
	}
	public String toString() {
		return "NumberCriteriaException: " + password1;
	}
	
}

class LetterCriteriaException extends Exception {
	String password1;
	public LetterCriteriaException(String password1) {
		this.password1 = password1;
		
	}
	public String toString() {
		return "LetterCriteriaException: " + password1;
	}
	
}
class SpecialCharCriteriaException extends Exception {
	String password1;
	public SpecialCharCriteriaException(String password1) {
		this.password1 = password1;
		
	}
	public String toString() {
		return "SpecialCharCriteriaException: " + password1;
	}
	
}