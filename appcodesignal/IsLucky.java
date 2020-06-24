package appcodesignal;

import java.util.ArrayList;

public class IsLucky {

	public static void main(String[] args) {
		isLucky(134008);
	}
	
	public static boolean isLucky(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String numberString = Integer.toString(n);
		boolean result = null != null;
		System.out.println(n);
		for (int i = 0; i < numberString.length(); i++) {
		    char c = numberString.charAt(i);   
		    int y = c - '0';
			list.add(y);
		}System.out.println(list);
		int sum = 0;
		for (int b = 0; b < list.size()-1; b++) {
			if (b < list.size()/2) {
				sum += list.get(b);
			}
			if (list.size() == 2) {
				sum = list.get(b);
			}
		}
		System.out.println("Sum: " + sum);
		int sum2 = 0;
		for (int b = 0; b < list.size(); b++) {
			if (b > list.size()/2-1) {
				sum2 += list.get(b);
			}
			if (list.size() == 2) {
				sum2 = list.get(b);
			}
		}
		System.out.println("Sum2: " + sum2);
		if (sum == sum2) {
			result = true;
		}
		System.out.println(result);
		return result;

	}

}
