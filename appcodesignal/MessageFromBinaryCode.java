package appcodesignal;

public class MessageFromBinaryCode {

	public static void main(String[] args) {
		messageFromBinaryCode("010010000110010101101100011011000110111100100001");
	}
	
	static String messageFromBinaryCode(String code) {
		String word = "";
		int foo = 0;
		for (int n = 0; n < code.length(); n+=8) {
			String newCode = code.substring(n, n+8);
			foo = Integer.parseInt(newCode, 2);
			word = word + Character.toString (foo);
			System.out.println(foo);
		}
		System.out.println(word);
		return word;

	}

}
