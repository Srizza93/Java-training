package basics;

import java.util.Arrays;
import java.util.stream.*;

public class Assignement1 { 
	public static int[] numbers;

	public static void main(String[] args) {	
		sumNumbers();
		int[] numbers = { 2, 10};
		Arrays.sort(numbers);
		System.out.println("\nFibonacci multiple of n is " + fib(4));
		minFunction(numbers);
		maxFunction(numbers);
		averFunction(numbers);

	}
	
	static void sumNumbers() {
		int n = 60;
		int sum = n + 1;
		System.out.println("The sum of n + 1 is " + sum);
		
	}
	
	public static void minFunction(int numbers[]) {
		System.out.println("\nMinimum number is " + numbers[0]);
						
	}
	
	public static void maxFunction(int numbers[]) {
		System.out.println("\nMaximum number is " + numbers[numbers.length-1]);
	}
	
	public static void averFunction(int numbers[]) {
		float sum = IntStream.of(numbers).sum();
		float average = sum / numbers.length;
		System.out.println("\nAverage number is " + average);
	}
	
public static int fib(int n) {
	if (n == 0) {
		return 1;
	}
		
	else if (n == 1) {
		return 1;
	}
		
	return ((n) * (fib(n-1)));
}

}
