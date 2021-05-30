package structural.decorator;

public class CheeseBurstPizza extends Pizza{
	public CheeseBurstPizza() {
		description = "Cheese-Burst Pizza";
	}

	@Override
	public double getCost() {
		return 340.99;
	}
}
