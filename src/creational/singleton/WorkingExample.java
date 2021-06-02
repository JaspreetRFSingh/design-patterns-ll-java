package creational.singleton;

public class WorkingExample {

	public static void main(String[] args) {
		SingletonContext sc = SingletonContext.getInstance();
		sc.doOperation();
	}

}
