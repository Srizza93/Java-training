package appcodesignal;

import java.util.Arrays;

public class AbsoluteValuesSumMinimization {

	public static void main(String[] args) {
		int[] array = {2, 4, 7};
		absoluteValuesSumMinimization(array);
	}
	
	public static int absoluteValuesSumMinimization(int[] a) {
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length / 2 - (a.length % 2 == 0 ? 1 : 0)]);
		return 0;

	}

}
