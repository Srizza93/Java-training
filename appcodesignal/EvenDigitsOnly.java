package appcodesignal;

import java.util.Arrays;
import java.util.List;

public class EvenDigitsOnly {

	public static void main(String[] args) {
		evenDigitsOnly(247622);
	}
	
	public static boolean evenDigitsOnly(int n) {
		System.out.println(n);
		int j = 0;
		int len = Integer.toString(n).length();
		int[] arr = new int[len];
		boolean result = false;
		while(n!=0)
		{
			arr[len-j-1] = n%10;
			n=n/10;
			j++;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]%2);
			if (arr[i]% 2 == 0) {
				result = true;
				System.out.println(result);
			}
			else {
				result = false;
				System.out.println(result);
				break;
			}
		}
		System.out.println(result);
		return result;

	}

}

/*
Boolean flag = true;
String string = Integer.toString(n);
for(int i = 0; i < string.length() && flag; i++){
    int a = string.charAt(i);
    if(a % 2 != 0) flag = false;
}
return flag;
*/

/*
 * return Integer.toString(n).matches("(0|2|4|6|8)*");
 * */
