package appcodesignal;

import java.util.ArrayList;
import java.util.Collections;

public class DeleteDigit {

	public static void main(String[] args) {
		deleteDigit(152);
	}
	
	static int deleteDigit(int n) {
		System.out.println(n);
		String number = Integer.toString(n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while(count < number.length()) {
			for (int i = 0; i < number.length(); i++) {
				count++;
				StringBuilder string = new StringBuilder(number); 
		        string.delete(i, i+1);
		        String res = string.toString();
		        list.add(Integer.parseInt(res));
			}
			
		}
		int max = Collections.max(list);
		System.out.println("Max number while deleting one digit: " + max);
		return max;
	}

}
