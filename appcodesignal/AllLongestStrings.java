package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

	public static void main(String[] args) {
		String[] inputArray = {"a", 
				 "abc", 
				 "cbd", 
				 "zzzzzz", 
				 "a", 
				 "abcdef", 
				 "asasa", 
				 "aaaaaa"};
		System.out.println(allLongestStrings(inputArray));

	}
	
	public static List<String> allLongestStrings(String[] inputArray) {
		int elementLength = inputArray[0].length();
		List<String> List = new ArrayList<String>();
		for(int i=0; i< inputArray.length; i++) {
		    if(inputArray[i].length() > elementLength) {
		        elementLength = inputArray[i].length();		        
		    }
		    if (inputArray[i].length() == elementLength) {
		    	List.add(inputArray[i]);
			}
		    for (int n = 0; n < List.size(); n++) {
				if (elementLength > List.get(n).length()) {
					List.remove(List.get(n));
				}
		}
		}
		return List;

	}

}
