package appcodesignal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigitDegree {

	public static void main(String[] args) {
		digitDegree(98);
	}
	// Sum of all digits in number as long as there are more then 1 digit
	static int digitDegree(int n) {
		System.out.println(n);
		int count=0,sum=0;
		int o = n;
		while(o > 9) {
			n=o;
			sum=0;
		while(n != 0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		count++;
		o = sum;
		}System.out.println(count);
		return count; 
	}

}
