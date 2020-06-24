package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestWord {

	public static void main(String[] args) {
		System.out.println(longestWord("To be or not to be"));
	}
	
	static String longestWord(String text) {
		int index = 0;
		int index2 = 0;
		int maxl = 0;
		int maxsti = 0;
		int maxendi = 0;
		String maxw = "";
		while (index <= text.length()) {
				
			if (index < text.length() &&  Character.isLetter(text.charAt(index)) && text.charAt(index) != ' ') {
				index++;
				
			}
			else {
				int actl = index - index2;
				if (actl > maxl) {
					maxl = actl;
					maxsti = index2;
					maxendi = index;
				}
				index++;
				index2 = index;
				
			}
		} maxw = text.substring(maxsti, maxendi);
		return maxw;

	}

}
