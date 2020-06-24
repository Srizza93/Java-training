package appcodesignal;

import java.util.Arrays;


public class MakeArrayConsecutive2 {

	public static void main(String[] args) {
		int[] statues = {1};
		System.out.println(makeArrayConsecutive2(statues));

	}
	
	public static int makeArrayConsecutive2(int[] statues) {	
		Arrays.sort(statues);
		int count = 0;
		for (int n = 0; n < statues.length-1; n++) {
				int c = statues[n + 1] - statues[n];
				//System.out.println(c);
				if (c != 1) {
					count += c - 1;
				}			
		}
		return count;

	}


}
