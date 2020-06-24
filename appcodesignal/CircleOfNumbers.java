package appcodesignal;

public class CircleOfNumbers {

	public static void main(String[] args) {
		circleOfNumbers(12, 10);
	}
	
	public static int circleOfNumbers(int n, int firstNumber) {
		int output = 0;
		if (firstNumber < n/2) {
			output = n/2 + firstNumber;
		}
		if (n/2 == firstNumber) {
			output = 0;
		}
		if (firstNumber > n/2) {
			output = firstNumber - n/2;
		}
		System.out.println(output);
		return output;
	}

}
