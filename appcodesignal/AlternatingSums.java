package appcodesignal;

import java.util.ArrayList;

public class AlternatingSums {

	public static void main(String[] args) {
		int[] list = {50, 60, 60, 45, 70};
		alternatingSums(list);
	}
	
	public static ArrayList<Integer> alternatingSums(int[] a) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int n = 0; n < a.length; n++) {
			if((n % 2) == 0) {
				list1.add(a[n]);
			}
			else {
				list2.add(a[n]);
			}
		} 
		int sum = list1.stream().mapToInt(Integer::intValue).sum();
		int sum2 = list2.stream().mapToInt(Integer::intValue).sum();
		result.add(sum);
		result.add(sum2);
		System.out.println(result);
		return result;

	}

}
