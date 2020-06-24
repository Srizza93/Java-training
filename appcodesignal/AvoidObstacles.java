package appcodesignal;


public class AvoidObstacles {

	public static void main(String[] args) {
		int[] list = {5, 3, 6, 7, 9};
		avoidObstacles(list);
	}
	
	public static int avoidObstacles(int[] inputArray) {
		int min = 2;
		System.out.print(9 % min + " "); // or 9 / 2 (4,5 1 remainder(4))
		for (int n = 0; n < inputArray.length; n++) {
			if (inputArray[n] % min != 0) {
				continue;
			}
			else {
				n = -1;
				min++;
				//System.out.println(min);
			}
		}
		//System.out.println(min);
		return min;
		
	}
}
/*You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.*/
