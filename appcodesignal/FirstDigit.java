package appcodesignal;

public class FirstDigit {

	public static void main(String[] args) {
		firstDigit("a a_933");
	}
	
	static char firstDigit(String inputString) {
		System.out.println(inputString);
		char[] array = inputString.toCharArray();
		char result = 0;
		for (int n = 0; n < array.length; n++) {
			if (Character.isDigit(inputString.charAt(n))) {
				result = array[n];
				break;
			}
		}System.out.println("First digit: " + result);
		return result;

	}

}
