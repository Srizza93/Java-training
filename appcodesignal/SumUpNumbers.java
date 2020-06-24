package appcodesignal;

import java.util.ArrayList;

public class SumUpNumbers {

	public static void main(String[] args) {
		sumUpNumbers("2 apples, 12 oranges3");
	}
	
	static int sumUpNumbers(String inputString) {
		System.out.println(inputString);
		int index = 0;
		int sum = 0;
		String str = "";
		String regex = "\\d+";;
		while (index <= inputString.length()) {
			if (index < inputString.length() && Character.isDigit(inputString.charAt(index))) {
				str = str + inputString.charAt(index);
				index++;
				
			}
			else {
				index++;
				if (str.matches(regex)) {
					sum += Integer.valueOf(str);
					System.out.println(str);
				}
				str = "";
			}
		}
		System.out.println(sum);
		return sum;

	}

}
