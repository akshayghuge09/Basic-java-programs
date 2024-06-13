package basic_Qutestions;

import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr1, arr2, arr3;
		int size;
		int i;
		System.out.print("Enter the size of the arrays: ");
		size = scanner.nextInt();

		// Initialize the arrays with the specified size
		arr1 = new int[size];
		arr2 = new int[size];
		arr3 = new int[size];

		System.out.println("Enter values for Array 1:");
		for (i = 0; i < size; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("\nEnter values for Array 2:");
		for (i = 0; i < size; i++) {
			arr2[i] = scanner.nextInt();
		}

		for (i = 0; i < size; i++) {
			arr3[i] = arr2[i] + arr1[i];
		}
		System.out.println("sum of two array is:");
		for (i = 0; i < size; i++) {
			System.out.println(arr3[i]);
		}
		
		scanner.close();

	}
}
