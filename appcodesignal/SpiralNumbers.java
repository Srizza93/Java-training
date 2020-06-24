package appcodesignal;

public class SpiralNumbers {

	public static void main(String[] args) {
		spiralNumbers(5);
		
	}
	
	static int[][] spiralNumbers(int n) {
		int[][] matrix = new int[n][n];
		int count = 1;
		int minCol = 0;
		int maxCol = n-1;
		int minRow = 0;
		int maxRow = n-1;
		while (count <= n*n) {
			//Right
			for (int i = minCol; i <= maxCol; i++) {
				matrix[minRow][i] = count;
				count++;			
			}
			//Down
			for (int i = minRow+1; i <= maxRow; i++) {
				matrix[i][maxCol] = count;
				count++;
			}
			// Left
			for (int i = maxCol-1; i >= minCol; i--) {
				matrix[maxRow][i] = count;
				count++;
			}
			//Up
			for (int i = maxRow-1; i >= minRow+1; i--) {
				matrix[i][minCol] = count;
				count++;
			}
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}
		System.out.println(matrix.length);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}System.out.println();
		}
		return matrix;

	}

}
