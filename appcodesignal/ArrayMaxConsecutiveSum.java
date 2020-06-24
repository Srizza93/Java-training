package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMaxConsecutiveSum {

	public static void main(String[] args) {
		int[] array = {1, 3, 2, 4};
		arrayMaxConsecutiveSum(array, 3);
	}
	
	static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
		int largestSum = 0;
	    int previousSum = 0;
	    for (int i = 0; i <= inputArray.length - k; i++) {
	        if (i == 0) {
	            for (int j = 0; j < k; j++) {
	                largestSum += inputArray[j];
	            }
	            previousSum = largestSum;
	        }
	        else {
	            int currentSum = previousSum - inputArray[i - 1] + inputArray[i + k - 1];
	            if (currentSum > largestSum) {
	                largestSum = currentSum;
	            }
	            previousSum = currentSum;
	        }
	    }
	    System.out.println(largestSum);
	    return largestSum;
	}

}
