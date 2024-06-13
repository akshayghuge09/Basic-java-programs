package basic_Qutestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of" + num + " " + fact);
		
		sc.close();
	}

}
