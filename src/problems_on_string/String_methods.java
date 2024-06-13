package problems_on_string;

import java.util.Scanner;

public class String_methods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "hello , world";

		int length = s.length();
		System.out.println("1. Length of the string: " + length);

		int hashCode = s.hashCode();
		System.out.println("2. Hash code of the string: " + hashCode);

		System.out.println("entre the another string to cmapare");
		String anotherString = sc.next();
		boolean isEqual = s.equals(anotherString);
		System.out.println("3. Are the strings equal? " + isEqual);

		String stringWithSpaces = "   Hello, World!   ";
		String trimmedString = stringWithSpaces.trim();
		System.out.println("4. After trimming: " + trimmedString);

		String substring = s.substring(7);
		System.out.println("5. Substring starting from index 7: " + substring);

		String anotherStringToConcat = " How are you?";
		String concatenatedString = s.concat(anotherStringToConcat);
		System.out.println("6. Concatenated string: " + concatenatedString);

		char charAtIndex = s.charAt(9);
		System.out.println("7. Character at index 8: " + charAtIndex);

		String substringWithIndices = s.substring(7, 12);
		System.out.println("8. Substring from index 7 to 11: " + substringWithIndices);
		
		sc.close();
	}

}
