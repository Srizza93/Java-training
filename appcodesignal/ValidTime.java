package appcodesignal;

public class ValidTime {

	public static void main(String[] args) {
		validTime("23:59");
	} 
	
	static boolean validTime(String time) {
		System.out.println(time);
		String hours = time.substring(0,2);
		String colon = time.substring(2,3);
		String minutes = time.substring(3,5);
		String colregex = ":";
		if (Character.isDigit(hours.charAt(0)) && Integer.valueOf(hours) >= 0 && Integer.valueOf(hours) <= 23 && colon.matches(colregex)
			&& Character.isDigit(minutes.charAt(0)) && Integer.valueOf(minutes) >= 0 && Integer.valueOf(minutes) <= 59) {
			return true;
		}
		return false;
	}

}
