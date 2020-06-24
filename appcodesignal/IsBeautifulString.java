package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsBeautifulString {

	public static void main(String[] args) {
		isBeautifulString("baabbcdafe");
	}
	public static boolean isBeautifulString(String inputString) {
		class Parser {
	        int getX(char pos) {
	        	System.out.println(pos - 'a');
	            return pos - 'a';
	        }
	    }
	    Parser p = new Parser();	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for (int n = 0; n < inputString.toCharArray().length; n++) {
	    	list.add(p.getX(inputString.charAt(n)));
	    }
	    boolean result = true;
	    Collections.sort(list);
	    if (list.get(0) != 0) {
	    	return false;
	    }
	    for (int a = 0; a < list.size()-1; a++) {
	    	if (Collections.frequency(list, list.get(a)) < Collections.frequency(list, list.get(a + 1))) {
	    		System.out.println("previous characters were less then actual");
	    		result = false;
	    	}
	    	if (list.get(a + 1) - list.get(a) > 1) {
	    		System.out.println("One letter is missing" + list.get(a + 1));
	    		result = false;
	    	}
	    }
	    System.out.println(list);
		System.out.println(inputString);
		return result;
	}
}
