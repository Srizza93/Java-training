package appcodesignal;

public class InterestingPolygon {
	
	public static void main(String[] args) {
		System.out.println(shapeArea(4));
	}
	
	public static int shapeArea(int n) {		
		return (1 + (n-1)*n) *2 - 1;

	}


}
