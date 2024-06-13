package basic_Qutestions;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year ");
		year = sc.nextInt();
		boolean flag = false;
		if ((year % 4) == 0) {
			if ((year % 100) == 0) {
				if ((year % 400) == 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				flag = true;
			}

		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("given year is LEAP year");
		} else {
			System.out.println("given year is not LEAP year");
		}
		sc.close();
	}

}
