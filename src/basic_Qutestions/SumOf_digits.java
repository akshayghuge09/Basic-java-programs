package basic_Qutestions;

import java.util.Scanner;

public class SumOf_digits {

	public static void main(String[] args) {

		System.out.println("Enter three digit no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			sum = sum + r;
		}
		System.out.println("sum of digits is:" + sum);
	
		sc.close();
	}

}
