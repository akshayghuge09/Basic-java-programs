package basic_Qutestions;

class SumOfDigits {
	int sum = 0;

	public void sum(String s) {
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char temp = s.charAt(i);
			if (Character.isDigit(temp)) {
				int x = Character.getNumericValue(temp);
				sum = sum + x;

			}
		}
		System.out.println(sum);
	}
}

public class SumOFDigitsFromString {

	public static void main(String[] args) {

		SumOfDigits string = new SumOfDigits();

		string.sum("13df56g");

	}

}
