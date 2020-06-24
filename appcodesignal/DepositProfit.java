package appcodesignal;

public class DepositProfit {

	public static void main(String[] args) {
		depositProfit(50, 10, 1000);
	}
	
	public static int depositProfit(double deposit, int rate, int threshold) {
		System.out.println("Deposit: " + deposit + "€\nRate: " + rate + "%\nThreshold: " + threshold + "€");
		int years = 0;
		for (int n = 0; n < 100; n++) {
			deposit += (deposit*rate)/100;
			System.out.println("Deposit: " + deposit + "€ Years: " + (n + 1));
			if (deposit >= threshold) {
				years = n + 1;
				System.out.println("Years: " + years);
				break;
			}
		}
		
		return years;

	}


}
