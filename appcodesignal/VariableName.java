package appcodesignal;

public class VariableName {

	public static void main(String[] args) {
		 boolean a = false;
	      
	      a = a ? a : true;
	      
	      //System.out.println(a + "\n");
		variableName("_55s2");
	}
	// password: at least one character, one number, one underscore _, can't start with number
	public static boolean variableName(String name) {
		System.out.println(name);
		boolean result = true;
		name = name.toUpperCase();
	    if(!name.matches("(.*[A-Z].*)") || !name.matches("(.*[0-9].*)") || !name.matches("(.*[ _ ].*)") || name.matches("(.*[   ].*)") || name.matches("[0-9].*")){
	        result = false;
	    }
		System.out.println(result);
		return result;
	}
}
