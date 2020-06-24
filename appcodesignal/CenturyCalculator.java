package appcodesignal;

public class CenturyCalculator {

	public static void main(String[] args) {
		System.out.println("iefi");
		System.out.println(centuryFromYear(101));
		int yea = 201;
		System.out.println(yea % 100);
		} 
	    static int centuryFromYear(int year) {
           if (year % 100 == 0) {
               year = year / 100;
           } else {
            year = (year / 100) + 1;
           }
           return year;
    }

		
	}

		

		

	

/*int year = 100;
if ((year < 101) && (year >= 1)) {
	int centuryFromYear = 1;*/