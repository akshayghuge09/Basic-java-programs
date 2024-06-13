package basic_Qutestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDandLCD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Find LCM and GCD : ");
		int num1;
		int num2;
		System.out.println("Enter first number : ");
		num1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter second number : ");
		num2 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("GCD : " + GCDandLCM.GCD(num1, num2));
		System.out.println("LCM : " + GCDandLCM.LCM(num1, num2));
	}

}

class GCDandLCM {

	public static int GCD(int num1, int num2) {

		int GCD = num1;
		if (num1 > num2) {
			GCD = num2;
		}

		while (true) {

			if (num1 % GCD == 0 && num2 % GCD == 0) {
				break;
			}

			--GCD;
		}

		return GCD;
	}

	public static int LCM(int num1, int num2) {
		int LCM = num1;
		if (num1 < num2) {
			LCM = num2;
		}

		while (true) {

			if (LCM % num1 == 0 && LCM % num2 == 0) {
				break;
			}

			++LCM;
		}
		return LCM;
	}
}
