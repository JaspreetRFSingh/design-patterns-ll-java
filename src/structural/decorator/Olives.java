package structural.decorator;

public class Olives extends PizzaTopping {

	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 19.99;
	}

}
