package basic_Qutestions;

import java.util.Scanner;

public class How_to_read_write_Array {

	public static void main(String[] args) {
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
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
