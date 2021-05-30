package structural.decorator;

public abstract class Pizza {
	public String description = "Pizza";
	public String getDescription() {
		return this.description;
	}
	public abstract double getCost();
}
