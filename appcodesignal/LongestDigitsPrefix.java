package appcodesignal;

public class LongestDigitsPrefix {

	public static void main(String[] args) {
		longestDigitsPrefix("123aa1");
	}
	
	static String longestDigitsPrefix(String inputString) {
		char[] array = inputString.toCharArray();
		String result = "";
		for (int n = 0; n < array.length; n++) {
			if (Character.isDigit(inputString.charAt(n))) {
				result = result + inputString.charAt(n);
			}
			else {
				break;
			}
		}System.out.println("First digits: " + result);
		return result;
	}

}
