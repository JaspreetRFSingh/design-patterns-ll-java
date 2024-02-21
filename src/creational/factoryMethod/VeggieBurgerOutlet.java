package creational.factoryMethod;

public class VeggieBurgerOutlet extends MenuItem{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }

}
