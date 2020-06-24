package appcodesignal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractEachKth {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		extractEachKth(array, 3);
	}
	static List<Integer> extractEachKth(int[] inputArray, int k) {
		List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
		System.out.println("Original list: " + list);
		System.out.println("Remove item every " + k + " positions.\n");
		for (int n = k-1; n < list.size(); n += k) {
			System.out.println("Remove: " + list.get(n));
			list.remove(list.get(n));
			n -= 1;
		} 
		System.out.println("\nNew list: " + list);
		return list;
	}
}
