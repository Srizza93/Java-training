package Assignement2StudentDataBase;

public class StudentDataBase {

	public static void main(String[] args) {
		StudentAccount acc1 = new StudentAccount("Simone", "5278914582", 1000);
		//StudentAccount acc2 = new StudentAccount("Jim", "8390759020", 3000);
		//StudentAccount acc3 = new StudentAccount("Bob", "9072384827", 2000);
		
		acc1.setPhone("0771241271");
		System.out.println(acc1.getPhone());
		acc1.setCity("Amsterdam");
		System.out.println(acc1.getCity());
		acc1.setState("The Netherlands\n");
		System.out.println(acc1.getState());
		System.out.println(acc1.toString());
		acc1.showCourses();
		acc1.enroll("Java", 350);
		acc1.enroll("Django", 520);

	
	}

	
	
}

class StudentAccount {
	
	private static int ID = 1001; // Internal ID
	private String name;
	private String SSN;
	private String emailID; // name + @student.com
	private String userID; //  ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private String phone;
	private String city;
	private String state;
	private double balance;
	
	// Constructor
	public StudentAccount(String name, String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		this.name = name;
		ID++;
		setUserID();
		setEmailaddress();

		
	}
	
	private void setEmailaddress() {
		emailID = name.toLowerCase() + "." + ID + "@student.com";
		System.out.println("Your email address is: " + emailID);
	}
	
	
	private void setUserID() {
		int range = (9000 - 1000) + 1;
		int random = (int) (Math.random() * range) + 1000;
		userID = ID + "" + random + SSN.substring(6, 10);
		System.out.println("User ID: " + userID);
	}
	
	public void enroll(String courses, double amount) {
		System.out.println("Enrolled: " + courses);
		pay(amount);
		
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Course cost: " + amount + "€");
		checkBalance();
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance + "€\n");
		
	}
	
	public String toString() {
		return "[Name: " + name + "]\n[Email ID: " + emailID + "]\n" + "[User ID: " + userID + "]\n" +"[Balance: " + balance + "€]\n";
		
	}
	
	public void showCourses() {
		System.out.println("Courses:\nJava = 350€\nJavascript = 380€\nDjango = 520€\nPython = 400€\n");
		
		
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return "Phone: " + phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return "City: " + city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return "State: " + state;
	}
}