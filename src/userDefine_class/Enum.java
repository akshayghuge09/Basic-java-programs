package userDefine_class;

enum Day {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

	int number;

	Day(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}

public class Enum {

	public static void main(String[] args) {
		// Printing the number with each day

		for (Day day : Day.values()) {
			System.out.println(day.getNumber() + " " + day);
		}
	}

}
