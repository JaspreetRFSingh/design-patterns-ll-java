package structural.decorator;

public class WorkingExample {

	public static void main(String[] args) {
		Pizza pizza = new CheeseBurstPizza();
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Olives(pizza);
		System.out.println("Order for: " + pizza.getDescription());
		System.out.println("Total cost: " + pizza.getCost());
	}

}
