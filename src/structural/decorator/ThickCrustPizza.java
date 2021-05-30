package structural.decorator;

public class ThickCrustPizza extends Pizza{
	public ThickCrustPizza() {
		description = "Thick-Crust Pizza";
	}

	@Override
	public double getCost() {
		return 210.99;
	}
}
