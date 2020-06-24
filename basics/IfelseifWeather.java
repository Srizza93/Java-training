package basics;

public class IfelseifWeather {
	public static void main(String[] args){
// This program will give suggestion of what to wear based on the weather (Temperature and Sun condition)
		
		int temperature = 70;
		String sunCondition = "Sunny";
		
		
		if (temperature > 80) {
			System.out.println("It's pleasant, wear short and t-shirt");
		}
		
		// and statement is &&
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}
		// or statement is ||
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. Make sure to wear warmer clothes");
		}
		
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		
		System.out.println("The program is ending");
		
	}

}
