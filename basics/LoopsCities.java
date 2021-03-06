package basics;

public class LoopsCities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
				
		// Define the array
		countries = new String[3]; // Array has 3 elements
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);

		System.out.println("*********************");
		
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: enters the look THEN tests condition
		do {
			System.out.println("State: " + states[i]);
			i = i + 1;
		  
		} while (i < 5);
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) { // ! is to indicate the oppposite, so in this case, while true
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State Found!");
				stateFound = true;
			}
			n++; // instead of n = n + 1
		}
		
		System.out.println("\nPrinting with For loop");
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
				
	}

}
