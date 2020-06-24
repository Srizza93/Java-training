package appcodesignal;

public class IsMAC48Address {

	public static void main(String[] args) {
		isMAC48Address("0E-1F-5E-84-45-E6");
	}
	
	static boolean isMAC48Address(String inputString) {
		System.out.println(inputString);
		String regex = "^[A-F0-9]*$";
		String string = "";
		boolean result = false;
		for(int i = 0; i < inputString.length(); i++) {
			if ((i + 1) % 3 != 0) {
				string += inputString.charAt(i);
				continue;
			}
			else if (inputString.charAt(i) != '-') {
				System.out.println("Sylmbol '-' is not matching");
				return false;
			}
		}
		System.out.println(string);
		if (string.matches(regex) && inputString.length() == 17) {
			result = true;
			System.out.print("Matches\n");
		}
		else {
			result = false;
			System.out.println("Doesn't match\n");
		}
		
		System.out.println(result);
		return result;

	}

}

/*
 * Pattern p = Pattern.compile("^([0-9a-fA-F]{2}[-]){5}([0-9a-fA-F]{2})$");
     Matcher m = p.matcher(inputString);
     */
