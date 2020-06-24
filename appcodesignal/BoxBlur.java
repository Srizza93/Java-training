package appcodesignal;

import java.util.Arrays;

public class BoxBlur {

	public static void main(String[] args) {
		int[][] image = {
				 {7, 4, 0},//9 0 45 
		         {5, 6, 2}, 
		         {1, 4, 2}} ;
		boxBlur(image);
		}
	    
	
	
	public static int[][] boxBlur(int[][] image) {
		int[][] result = new int[image.length - 2][image[0].length - 2];
	    
	    for(int i = 0; i < image.length - 2; i++) {
	        for(int j = 0; j < image[i].length - 2; j++) {
	            int sum = 0;
	            
	            for(int k = i; k < i + 3; k++) {
	                for(int l = j; l < j + 3; l++) {
	                    sum += image[k][l];
	                }                
	            }            
	            result[i][j] = sum / 9;
	        }
	    }
	    System.out.println(Arrays.deepToString(result));
	    return result;

	}

}
