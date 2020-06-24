package appcodesignal;

import java.util.Arrays;

public class SortByHeight {

	public static void main(String[] args) {
		int[] list = {-1, 150, 190, 170, -1, -1, 160, 180};
		sortByHeight(list);
	}
	
	public static int[] sortByHeight(int[] a) {
		int[] sortedArray = new int[a.length];
	      System.arraycopy(a, 0, sortedArray, 0, a.length);

	      for (int i = 0; i < sortedArray.length - 1; i++)
	      {
	         /* is current odd, if so search next odd */
	         if (sortedArray[i] != -1)
	         {
	            /* search for next odd and compare */
	            for (int j = i + 1; j < sortedArray.length; j++)
	            {
	               if ((sortedArray[j] != -1) && (sortedArray[i] > sortedArray[j]))
	               {
	                  int temp = sortedArray[i];
	                  sortedArray[i] = sortedArray[j];
	                  sortedArray[j] = temp;
	               }
	            }
	         }
	      }
	      for (int i: sortedArray)
	      {
	         System.out.println(i);
	      }
		return sortedArray;

	}

}
