package appcodesignal;

public class IsIPv4Address {

	public static void main(String[] args) {
		isIPv4Address("172.16.254.1");
	}
	
	public static boolean isIPv4Address(String inputString) {
		String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
		System.out.println(inputString.matches(PATTERN));
		return inputString.matches(PATTERN);
	}
}
/*
An identification number for devices connected to the internet. 
An IPv4 addresses written in dotted quad notation 
consists of four 8-bit integers separated by periods.

In other words, it's a string of four numbers each between 0 and 255 inclusive, 
with a "." character in between each number. All numbers should be present without leading zeros.

Examples:

192.168.0.1 is a valid IPv4 address
255.255.255.255 is a valid IPv4 address
280.100.92.101 is not a valid IPv4 address because 280 
is too large to be an 8-bit integer (the largest 8-bit integer is 255)
255.100.81.160.172 is not a valid IPv4 address because it contains 5 integers instead of 4
1..0.1 is not a valid IPv4 address because it's not properly formatted
17.233.00.131 and 17.233.01.131 are not valid IPv4 addresses because they contain leading zeros
*/