package problems_on_string;

public class StringSplit {

	public static void main(String[] args) {

		String inputString = "Hello - World Java - Programming";

		String[] splitBySpace = inputString.split(" ");
		System.out.println("Splitting by blank space:");
		for (String word : splitBySpace) {
			System.out.println(word);
		}

		String[] splitByHyphen = inputString.split("-");
		System.out.println("\nSplitting by hyphen:");
		for (String word : splitByHyphen) {
			System.out.println(word);
		}
	}

}
