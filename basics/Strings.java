package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "ring";
		bookTitle = "Lord of the rings";
				
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
				
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "048958221";
		
		System.out.println("\nThere are " + SSN.length() + " digits in your SSN");
		
		// Print the initials plus last 4 digits SSN		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(SSN.substring(5));
		
		
	}
	      
	

}
