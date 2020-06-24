package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to n
		
		System.out.println(sum(6));
		
		// Write a function that returns min
		int[] numbers = { -345, 45, 346, 57, 231};
		System.out.println("Min is: " + Findmin(numbers));
		
		// Write a function that return max
		System.out.println("Max is: " + Findmax(numbers));
		
		// Write a function that return average
		System.out.println("Average is: " + FindAvg(numbers));

	}
	
	public static int FindAvg(int[] arr) {
		int sum = 0;
		for (int n = 0; n < arr.length; n++) {
			sum = sum + arr[n];
			
		}
		
		System.out.println("Sum is: " + sum);
		return sum/arr.length;
	}
	
	public static int Findmin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int Findmax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
			}
		}
		
		return max;
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
			
		}
		
		return sum;
	}
}
