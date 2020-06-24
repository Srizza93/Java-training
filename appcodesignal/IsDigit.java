package appcodesignal;

public class IsDigit {

	public static void main(String[] args) {
		System.out.println(isDigit('0'));
	}
	
	static boolean isDigit(char symbol) {
		if (symbol >= '0' && symbol <= '9') { //OR return Character.isDigit(symbol);
			return true;
		}
		return false;
	}

}
