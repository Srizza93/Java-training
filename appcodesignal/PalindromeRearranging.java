package appcodesignal;

import java.util.Arrays;
import java.util.Collections;

public class PalindromeRearranging {

	public static void main(String[] args) {
		System.out.println(palindromeRearranging("abc"));
	}
	
	public static boolean palindromeRearranging(String inputString) {
		boolean result = false;	
		int count = 0;
		System.out.println("Word is: " + inputString);
		String[] list = inputString.split("");
		System.out.println("List is: " + Arrays.toString(list));
		for (int n = 0; n < list.length-1; n ++) {
			System.out.println("ch: " + list[n]);
			System.out.println(Arrays.toString(list));	
		}
		do {
			for (int s = 0; s < list.length-1; s++) {
				count++;
				System.out.println("Count: " + count);
				String temp = list[s];
				temp = list[s];
			    list[s] = list[s + 1];
			    list[s + 1] = temp;
				System.out.println("Now: " + list[s] + " List: " + Arrays.toString(list));
				String[] list2 = Arrays.copyOf(list, list.length); 
				Collections.reverse(Arrays.asList(list2));
				System.out.println("List2: " + Arrays.toString(list2));
				if (Arrays.toString(list).equals(Arrays.toString(list2))) {
					result = true;
					System.out.println(result);
				}
			}
			} while (count < list.length*list.length && list.length != 1);
		if (inputString.length() == 1) {
			result = true;
			System.out.println(result);
		}
		return result;						
	}

}
