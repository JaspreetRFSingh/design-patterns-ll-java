package creational.factoryMethod;

public class CheeseBurgerOutlet extends MenuItem {

    @Override
    public Burger createBurger() {
        return new CheeseBurger();
    }
}
