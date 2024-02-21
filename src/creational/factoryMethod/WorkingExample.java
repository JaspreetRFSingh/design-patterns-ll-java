package creational.factoryMethod;

public class WorkingExample {

	public static void main(String[] args) {
		MenuItem cheeseBur = new CheeseBurgerOutlet();
		Burger cheeseBurger = cheeseBur.prepareBurger();

		MenuItem veggieBur = new VeggieBurgerOutlet();
		Burger veggieBurger = veggieBur.prepareBurger();
	}

}
