package problems_on_string;

public class StringBufferExamples {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer("Hello, world ");

		int length = string.length();
		System.out.println("1. Length of the string: " + length);

		string.append("World!");
		System.out.println("3. After appending: " + string);

		string.insert(7, "Awesome ");
		System.out.println("4. After inserting: " + string);

		string.delete(7, 14);
		System.out.println("5. After deleting: " + string);

		string.reverse();
		System.out.println("6. After reversing: " + string);
		
		StringBuffer string1 = new StringBuffer("Hello, world ");
		string1.replace(7,14,"universe");
		System.out.println("7. replaced string: "+string1);
	}

}
