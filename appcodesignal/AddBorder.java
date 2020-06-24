package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBorder {

	public static void main(String[] args) {
		String[] matrixList = 
			      {"abc",
		           "ded"};
		addBorder(matrixList);
	}
	public static List<String> addBorder(String[] picture) {
		List<String> list = new ArrayList<String>();
		list.add("*");
		char ch = '*';
		String asthString = list.get(0) + ch;
		for (int i = 0; i < picture[0].length(); i ++) {
			asthString +=  ch;
			list.set(0, asthString);
		}
		for (int n = 0; n < picture.length; n++) {
			list.add("*" + picture[n] + "*");
		}
		list.add(asthString);
        System.out.println(Arrays.toString(picture));
		System.out.println(list);
		System.out.println(picture[0]);
		return list;
	}
}
