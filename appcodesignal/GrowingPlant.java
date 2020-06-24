package appcodesignal;

public class GrowingPlant {

	public static void main(String[] args) {
		growingPlant(100, 10, 450);
	}
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int day = 0;
		int night = 0;
		int count = 0;
		for (int n = 0; n < 10000; n++) {
			count++;
			System.out.println("#" + n);
			night += upSpeed - downSpeed;
			day = night + downSpeed;
			System.out.println("Day: " + day + " Night: " + night);
			if (day >= desiredHeight) {
				System.out.println("\nDays to desired height: " + count);
				break;
			}
		}
		return count;
	}
}
