package appcodesignal;

public class BuildPalindrome {

	public static void main(String[] args) {
		System.out.println(buildPalindrome("abc"));
	}
	
	static String buildPalindrome(String st) {
		int i = 0;
		if (!st.equals(new StringBuilder(st).reverse())) {
			st+="!";
		}
		System.out.println(st);
		while (!st.substring(0,st.length()-1).equals(new StringBuilder(st.substring(0,st.length()-1)).reverse().toString())) {
			st = st.substring(0,st.length()-i-1)+st.substring(i,i+1)+st.substring(st.length()-i-1);
			i++;
		
		}
		return st.substring(0,st.length()-1);
	}

	

}
