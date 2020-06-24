package appcodesignal;

public class AlphabeticShift {

	public static void main(String[] args) {
		alphabeticShift("crazy");
	}
	
	public static String alphabeticShift(String inputString) {
		System.out.println(inputString);
		char[] toEncode = inputString.toCharArray();
		char z = '{';
		char a = 'a';
	    for (int i = 0; i < toEncode.length; i++) {
	    	if (Character.isLetter(toEncode[i])) {
	            toEncode[i] += 1;	            
	        }
	    	if (toEncode[i] == z) {
            	toEncode[i] = a;
            }
	    }
	    inputString = String.valueOf(toEncode);
	    System.out.println(inputString);
	    return inputString;
	}
}
