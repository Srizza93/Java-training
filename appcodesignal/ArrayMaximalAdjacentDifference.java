package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMaximalAdjacentDifference {

	public static void main(String[] args) {
		int[] list = {2, 4, 1, 0};
		System.out.println(arrayMaximalAdjacentDifference(list));
		
	}
	
	public static int arrayMaximalAdjacentDifference(int[] inputArray) {
		List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(Arrays.toString(inputArray));
		for (int n = 0; n < inputArray.length-1; n++) {
			list1.add(inputArray[n + 1] - inputArray[n]);
			System.out.println(list1);
		}
		Collections.reverse(list);
		System.out.println(list);
		for (int i = 0; i < list.size()-1; i++) {
			list1.add(list.get(i + 1) - list.get(i));
			System.out.println(list1);
		}
		return Collections.max(list1);
	}
}
