package structural.adapter;

public class DuckSimulator {
	Duck duck;
	public DuckSimulator(Duck duck) {
		this.duck = duck;
	}
	
	public void testDuck() {
		duck.quack();
		duck.fly();
	}
}
