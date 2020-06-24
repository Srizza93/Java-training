package passwordCriteriaAppPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		String filename = "/Users/martina/eclipse-workspace/JavaTraining/Files/PasswordFile.txt";
		File file = new File(filename);
		String[] passwords = new String[13];
		String password = null;	
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
		
		
		
		
		for (int i = 0; i < passwords.length; i++) {
			password = passwords[i];
			Pattern specialCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);//String pattern = "\\A(?=\\S*[0-9])(?=\\S*[a-z])(?=\\S*[A-Z])(?=\\S*[}{@?\".#$-%*;^_&+=])\\S{8,}\\z";
			try {
				if (!password.matches(".*\\d.*")) {
				    throw new NumberMissingException(password);	
				}
				if (!password.matches(".*[a-zA-Z]+.*")) {
					throw new LetterMissingException(password);
				}
				if (!specialCharPatten.matcher(password).find()) {
					throw new SpecialCharacterMissingException(password);
				} else {
					System.out.println("Valid password");
				}
				
				System.out.println(password);	
		    } catch (NumberMissingException e) {
				System.out.println("ERROR: Minimum 1 number required");
				System.out.println(e.toString());
		    } catch (LetterMissingException e) {
		    	System.out.println("ERROR: Minimum 1 letter required");
				System.out.println(e.toString());
			} catch (SpecialCharacterMissingException e) {
				System.out.println("ERROR: Minimum 1 special character required");
				System.out.println(e.toString());
		    } 
		
	    }

    }

}	
class NumberMissingException extends Exception {
	String num;
	
	NumberMissingException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return ("NumberMissingException: " + num);
	}
	
	
} 
class LetterMissingException extends Exception {
	String num;
	
	LetterMissingException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return ("LetterMissingException: " + num);
	}
	
	
}

class SpecialCharacterMissingException extends Exception {
	String num;
	
	SpecialCharacterMissingException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return ("SpecialCharacterMissingException: " + num);
	}
	
	
} 