package exceptionsfiles;

// We divide number to zero to generate an error. Then we will catch it.

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts");
		doMath(12, 0);
		System.out.println("Program continues");
		
	}
	
	
	public static void doMath(int a, int b) {
		answer(a, b);

	}
	
	public static double answer(int x, int y) {
		// Catch error here
		return x/y;
		
	}

}
