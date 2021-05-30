package structural.decorator;

public class Cheese extends PizzaTopping{

	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 60;
	}

}
