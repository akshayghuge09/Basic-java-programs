package basic_Qutestions;

import java.util.Scanner;

public class SumOfArray_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of array elements");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

		}
		System.out.println("sum of array elements" + sum);

		sc.close();
	}

}
