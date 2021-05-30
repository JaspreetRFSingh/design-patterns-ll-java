package structural.decorator;

public class Peppers extends PizzaTopping {

	Pizza pizza;
	
	public Peppers(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Peppers";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 10;
	}

}
