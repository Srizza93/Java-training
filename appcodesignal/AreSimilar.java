package appcodesignal;

import java.util.Arrays;

public class AreSimilar {

	public static void main(String[] args) {
		int[] list1 = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
		int[] list2 = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
		System.out.println(areSimilar(list1, list2));
	}
	
	public static boolean areSimilar(int[] a, int[] b) {
		int sum = 0;
	    for (int i = 0; i < a.length; i++) {
	    	if (a[i] != b[i]) {
	    		sum++;
	    		}
	    	}
	        Arrays.sort(a);
	        Arrays.sort(b);
	    return Arrays.equals(a, b) && sum < 3;
	}
		
}

