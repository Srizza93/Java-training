package appcodesignal;

public class AreEquallyStrong {

	public static void main(String[] args) {
		System.out.println(areEquallyStrong(20, 5, 15, 10));
	}
	
	public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		boolean result = false;
		int mySum = yourLeft + yourRight;
		int myMax = Math.max(yourLeft, yourRight);
		int friendsSum = friendsLeft + friendsRight;
		int friendsMax = Math.max(friendsLeft, friendsRight);
		if (mySum == friendsSum) {
			if (myMax == friendsMax) {
				result = true;
			}
		}
		else {
			result = false;
		}
		return result;

	}

}
