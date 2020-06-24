package appcodesignal;

import java.util.stream.IntStream;

public class CheckPalindrome {

	public static void main(String[] args) {
	    System.out.println("Checkpalindrome(inputString)" + " = " + checkPalindrome("aabap"));
	    }
	

	static boolean checkPalindrome(String inputString) {
	    return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}
}