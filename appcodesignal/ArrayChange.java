package appcodesignal;

public class ArrayChange {

	public static void main(String[] args) {
		int [] list = {-1000, 0, -2, 0};
		System.out.println(arrayChange(list));
	}
	
	static int arrayChange(int[] inputArray)  {
		int count = 0;
		for (int i = 0; i < inputArray.length-1; i++) {
			do {
				if (inputArray[i] >= inputArray[i + 1]) {
					inputArray[i + 1] += 1;
					count += 1;
				}
			} while ((inputArray[i] >= inputArray[i + 1]));		
		}	
		return count;

	}

}
