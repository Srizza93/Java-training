package appcodesignal;

public class DigitsProduct {

	public static void main(String[] args) {
		System.out.println(digitsProduct(10));
	}
	static int digitsProduct(int product) {
		int count = 21;
		int res = 1;
		String countp = "";
		if(product == 1) {
			return 1;
		}
		else if(product == 0) {
			return 10;
		}
		else if (product >= 2 && product <= 9) {
            return product;
        }
		else {
			while (count < 100000) {
				count++;
				countp = String.valueOf(count);
				char[] array = countp.toCharArray();
				for(int n = 0; n < array.length; n++){
			        res *= array[n]-'0';
			    }
				if (res == product) {
					//System.out.println(Integer.valueOf(countp));
					return Integer.valueOf(countp);
				}
				else {
					res = 1;
				}
			}
		}
		if (res == 1) {
			return -1;
		}
		return res;
	}

}
