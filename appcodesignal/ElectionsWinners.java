package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ElectionsWinners {

	public static void main(String[] args) {
		int[] votes = {2, 3, 5, 2};
		electionsWinners(votes, 3);
	}
	
	static int electionsWinners(int[] votes, int k) {
		System.out.println("Vote per candidate: " + Arrays.toString(votes) + "\nRemaing votes: " + k);
		List<Integer> list = Arrays.stream(votes).boxed().collect(Collectors.toList());
		int max = Collections.max(list);
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < votes.length; i++) {
			if (max - votes[i] == 0) {
				count2++;
			}
		}
		for (int n = 0; n < votes.length; n++) {
			votes[n] = votes[n] + k;
			if (votes[n] > max) {
				count++;
			}
		}
		if (count2 == 1 && count < 2) {
			System.out.println("Certain winner2: " + count2);
			return count2;
		}
		System.out.println("Certain winner: " + count);
		return count;

	}

}
