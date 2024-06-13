package basic_Qutestions;

import java.util.Scanner;

public class Salary_calculation {

	public static void main(String[] args) {

		System.out.println("Enter the salary of employee");
		Scanner sc = new Scanner(System.in);

		float sal = sc.nextFloat();

		float DA = sal * (20.0f / 100);
		float HRA = sal * (30.0f / 100);

		System.out.println("Gross salary of employee is:" + (sal + DA + HRA));

		System.out.println("Calaculation for incaome tax based on salary range");

		if (sal < 4000) {
			System.out.println("income tax is:" + (sal * (4.0f / 100)));
		}
		if (sal > 4000 && sal < 10000) {
			System.out.println("income tax is:" + (sal * (6.0f / 100)));
		}
		if (sal > 10000 && sal < 17000) {
			System.out.println("income tax is:" + (sal * (8.0f / 100)));
		}
		if (sal > 17000 && sal < 27000) {
			System.out.println("income tax is:" + (sal * (10.0f / 100)));
		}
		if (sal > 27000) {
			System.out.println("income tax is:" + (sal * (15.0f / 100)));
		}

		sc.close();
	}

}
