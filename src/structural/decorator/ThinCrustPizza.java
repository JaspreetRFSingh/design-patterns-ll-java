package structural.decorator;

public class ThinCrustPizza extends Pizza {
	public ThinCrustPizza() {
		description = "Thin-Crust Pizza";
	}
	@Override
	public double getCost() {
		return 280.99;
	}
}
