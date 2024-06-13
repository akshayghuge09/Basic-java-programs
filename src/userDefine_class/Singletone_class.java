package userDefine_class;

public class Singletone_class {

	static Singletone_class instance;

	private Singletone_class() {
	}

	public static Singletone_class getInstance() {
		if (instance == null) {
			instance = new Singletone_class();
			System.out.println("object created");
		} else {
			System.out.println("we can create only one object of this class");
		}
		return instance;
	}

	public static void main(String[] args) {
		Singletone_class singletonInstance1 = Singletone_class.getInstance();
		
// we can not create second object of this class		
		Singletone_class singletonInstance2 = Singletone_class.getInstance();
		
		System.out.println(singletonInstance1);
		System.out.println(singletonInstance2);
	}
}
