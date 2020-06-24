package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LineEncoding {

	public static void main(String[] args) {
		lineEncoding("aabbbc");
	}
	
	static String lineEncoding(String s) {
		System.out.println(s);
		List<Character> list = new ArrayList<Character>();
	    for (char c : s.toCharArray()) {
	        list.add(c);
	    }
	    list.add('!');
	    System.out.println(list);
	    int count = 1;
	    String s2 = "";
	    for (int n = 0; n < list.size()-1; n++) {
	    	System.out.println(count);
	    	if (list.get(n) == list.get(n + 1)) {
	    		count++;
	    	}
	    	else {
	    		if (count > 1) {
	    			s2 = s2 + Integer.toString(count) + list.get(n);
	    		}
	    		else {
	    			s2 = s2 + list.get(n);
	    		}
	    		count = 1;
	    	}
	    }
	    System.out.println(s2);
		return s2;

	}

}
