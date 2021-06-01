package creational.factory;

public class WorkingExample {

	public static void main(String[] args) {
		WebDriverFactory wdf = new EdgeDriverFactory();
		wdf.startDriver();
	}

}
