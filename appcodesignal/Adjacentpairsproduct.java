package appcodesignal;

import java.util.Arrays;

public class Adjacentpairsproduct {
	public static void main(String[] args) {		
		int[] list = {3, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(list));
		/*int[] list2 = new int[list.length];
        for (int n = 0; n < list.length-1; n++) {
        	list2[n] = list[n] * list[n+1];
        }   
        Arrays.sort(list);
        System.out.println(list2[list2.length-1]);*/
  
        
    	
        
	}
	
// WORKING VERSION
	public static int adjacentElementsProduct(int[] inputArray) {
	    int product = inputArray[0] * inputArray[1];
	    for(int i = 1; i < inputArray.length-1; i++){
	        int temp = inputArray[i] * inputArray[i+1];
	        if(temp > product){
	            product = temp;
	        }
	    }
	    return product;
	}
}

//1, 0, 1, 0, 1000