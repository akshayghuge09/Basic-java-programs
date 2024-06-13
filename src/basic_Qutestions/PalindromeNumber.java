package basic_Qutestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nCheck palindrome number : ");
		int checkPalindromeNumber;
		checkPalindromeNumber = Integer.parseInt(bufferedReader.readLine());
		if (PalindromeNumberMethod.IsPalindrome(checkPalindromeNumber)) {
			System.out.println("\nNumber is palindrome Number\n");
		} else {
			System.out.println("\nNumber is not palindrome Number\n");
		}

	}

}
class PalindromeNumberMethod {
	   
	public static boolean IsPalindrome(int number)
	{
		int var1 = number;
		int var2, var3=0;
		while (var1>0)
		{
			var2 = var1%10;
			var3 = var3 * 10 + var2;
			var1 = var1/10;
		}
		if(var3 == number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
