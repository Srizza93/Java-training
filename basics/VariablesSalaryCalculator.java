package basics;

public class VariablesSalaryCalculator {
	public static void main(String[] args) {
		// Create a variable
		
		// Create a variable
		String career;
		System.out.println("Program is starting");
		
		// Defined a variable
		career = "Software developer";
		System.out.println("My career is " + career);
		
		// Declare and define
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		career = "Web developer";
		
		double salary = hoursperweek * weeksperyear * rate;
		System.out.print("My salary as a " + career + " at the rate of $" + rate + " per hour, is $" + salary + " per year");
		
		// Computer out annual salary
		// rate * hoursperweek * hoursperyear
	}

}
