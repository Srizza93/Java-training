package appcodesignal;

import java.util.Arrays;

public class MatrixElementSum {

	public static void main(String[] args) {  
		int[][] matrixList = {
			{0,1,1,2},
		    {0,5,0,0},
		    {2,0,3,3}};
	matrixElementsSum(matrixList, 0);
	}
	public static int matrixElementsSum(int[][] matrix, int count) {
		int rows, cols, sumCol;
		for (int[] room : matrix) {
			System.out.print(" [ ");
			for (int freeRoom : room) {
				System.out.print(freeRoom + " ");
			}
			System.out.print("]\n");
		}
		System.out.println();
		rows = matrix.length;  
	    cols = matrix[0].length; 
		for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){ 
            	if (matrix[j][i] != 0) {
            		sumCol = sumCol + matrix[j][i];
            		count += matrix[j][i];
            	}
            	else {
            		break;
            	}            
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
		System.out.println("\nFinal sum is: " + count);
		return 0;
	}
}