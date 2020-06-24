package appcodesignal;

import java.util.Arrays;

public class ArrayReplace {

	public static void main(String[] args) {
		int[] list = {1, 2, 1};
		arrayReplace(list, 1, 3);
	}
	
	public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		System.out.println(Arrays.toString(inputArray));
		for (int n = 0; n < inputArray.length; n++) {
			if (inputArray[n] == elemToReplace) {
				inputArray[n] = substitutionElem;
			}
		}
		System.out.println(Arrays.toString(inputArray));
		return inputArray;

	}

}
