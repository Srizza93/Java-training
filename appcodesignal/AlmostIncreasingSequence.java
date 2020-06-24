package appcodesignal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		sequence.add(3);
		sequence.add(2);
		//sequence.add(1);
		//sequence.add(5);
		//sequence.add(1);
		//sequence.add(8);
		System.out.println(sequence);
		//System.out.println(almostIncreasingSequence(sequence));
		almostIncreasingSequence(sequence);
		

	}
	
	static <E> boolean almostIncreasingSequence(List<Integer> sequence) {
		Collections.sort(sequence);
		System.out.println(sequence);
		boolean result = true;
		int count = 0;
		for (int n = 0; n < sequence.size()-1; n++) {
			//System.out.println(sequence.get(n + 1));
			int c = sequence.get(n + 1) - sequence.get(n);
			System.out.println("Result: " + c + " | n°: " + n + " | ");
		    if (c != 1) {
		    	result = false;
		    	System.out.println(result);
		    	count += 1;
		    	continue;
		    }
		    if (count == 2) {
		    	result = false;
		    	System.out.println(result);
		    }
		    else {
		    	result = true;
		    	System.out.println(result);
		    }
		}		
		return result;
	}
}

/*
 *  Correct answer
 * boolean almostIncreasingSequence(int[] a) {
    int count1 = 0 , count2 = 0;
    for(int i = 0 ; i < a.length-1 ; i++){
        if(a[i] >= a[i+1]) count1++;
    }

    for(int i = 0 ; i < a.length-2 ; i++){
        if(a[i] >= a[i+2]) count2++;
    }
     return (count1 <=1) && (count2 <= 1);
} */
