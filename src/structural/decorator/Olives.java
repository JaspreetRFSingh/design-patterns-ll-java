package structural.decorator;

public class Olives extends PizzaTopping {

	Pizza pizza;

	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}

	@Override
	public double getCost() {
		return 19.99;
	}

}
