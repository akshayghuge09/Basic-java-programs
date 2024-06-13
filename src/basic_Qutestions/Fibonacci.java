package basic_Qutestions;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of fibonacci");
		n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a + "\n" + b);
		for (int i = 0; i <= n; i++) {
			int fibo = a + b;
			a = b;
			b = fibo;
			System.out.println(fibo);
		}
		
		sc.close();
	}

}
