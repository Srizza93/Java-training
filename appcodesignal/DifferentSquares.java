package appcodesignal;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,1},
				{2,2,2},
				{2,2,2},
				{1,2,3},
				{2,2,1}
		};
		differentSquares(matrix);
		
	}
	static int differentSquares(int[][] matrix) {
		Set<String> set = new HashSet<>();
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				set.add(matrix[i][j] + ""+ matrix[i][j-1] + ""+ matrix[i-1][j] + ""+ matrix[i-1][j-1]);
			}
		}System.out.println(set);
		return set.size();

	}

}
