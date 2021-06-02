package creational.singleton;

public class SingletonContext {
	private static SingletonContext uniqueInstance;
	
	private SingletonContext() {
	}
	
	public static SingletonContext getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonContext();
		}
		return uniqueInstance;
	}
	
	public void doOperation() {
		System.out.println("Connection established!!");
	}
	
}
