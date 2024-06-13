package basic_Qutestions;

import java.util.Scanner;

public class Arithmatic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter two no.");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("addition of two no=" + (x + y));
		System.out.println("substraction of two no=" + (x - y));
		System.out.println("division of two no=" + (x / y));
		System.out.println("multiplication of two no=" + (x * y));

		sc.close();

	}

}
