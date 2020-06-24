package appcodesignal;

public class FindEmailDomain {

	public static void main(String[] args) {
		findEmailDomain("admin@mailserver2.ru");
	}
	
	static String findEmailDomain(String address) {
		System.out.println(address);
		System.out.println(address.substring(address.lastIndexOf("@") + 1));
		return address.substring(address.lastIndexOf("@") + 1);

	}

}
