package basic_Qutestions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		System.out.println("Enter no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		int temp3 = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		int temp2 = num;
		while (temp2 != 0) {
			int r = temp2 % 10;
			temp2 = temp2 / 10;
			int index = 1;
			for (int i = 0; i < count; i++) {
				index = index * r;
			}

			temp3 = temp3 + index;
		}
		if (temp3 == num) {
			System.out.println("the given no is armstrong");
		} else {
			System.out.println("the given no is not armstrong");
		}
		sc.close();
	}

}
