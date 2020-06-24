package appcodesignal;

public class ReverseInParentheses {

	public static void main(String[] args) {
		System.out.println(reverseInParentheses("foo(bar)baz"));
	}
	
	public static String reverseInParentheses(String inputString) {
        if(inputString.length() == 0) {
        	return "";
        }
        
        int begin = 0, end = 0;
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) == '(') {
            	begin = i;
            }
            if(inputString.charAt(i) == ')') {
                end = i;
                StringBuilder sb = new StringBuilder(inputString.substring(begin+1, end));
                return reverseInParentheses(inputString.substring(0, begin) + sb.reverse().toString() + inputString.substring(end+1));
        	}
        }
		return inputString;
	}
}
