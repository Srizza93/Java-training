package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DifferentSymbolsNaive {

	public static void main(String[] args) {
		differentSymbolsNaive("cabddca");
	}
	
	static int differentSymbolsNaive(String s) {
		System.out.println(s);
		char[] array = s.toCharArray();
		System.out.println(Arrays.toString(array));
		Set<Character> list1 = new TreeSet<Character>();
		int count = 0;
	    for (char c : array) {
	        list1.add(c);
	    }
	    for (int n = 0; n < list1.size(); n++) {
	    	count++;
	    }
	    System.out.println("Unique letters: " + count);
	    System.out.println(list1);
		
		return count;

	}

}
