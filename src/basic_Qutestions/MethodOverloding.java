package basic_Qutestions;

class Addition {
	public void add(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println("addition of nos. :" + sum);
	}

	public void add(double... numbers) {
		double sum = 0.0;
		for (double num : numbers) {
			sum = sum + num;
		}
		System.out.println("addition of nos. :" + sum);
	}
}

public class MethodOverloding {

	public static void main(String[] args) {

		Addition a = new Addition();
		a.add(1, 2, 3, 4, 5, 60);
		a.add(1.1, 1.6, 2.5);
	}

}
