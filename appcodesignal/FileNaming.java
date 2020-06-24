package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileNaming {

	public static void main(String[] args) {
		String[] files = {"a(1)", 
				 "a(6)", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a"};
		fileNaming(files);
	}
	
	static String[] fileNaming(String[] names) {
		Set<String> set = new HashSet<>();
		String[] fileNames = new String[names.length];
		for(int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.println(set + "\n" + Arrays.toString(fileNames));
			if(!set.contains(name)) {
				set.add(name);
				fileNames[i] = name;
			}
			else {
				int k = 0;
				String newName = name;
				while(set.contains(newName)) {
					k++;
					newName = name + "(" + k + ")";
				}
				set.add(newName);
				fileNames[i] = newName;
			}
		}
		System.out.println(Arrays.toString(fileNames));
		return fileNames;

	}

}
