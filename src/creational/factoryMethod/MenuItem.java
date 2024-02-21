package creational.factoryMethod;

public abstract class MenuItem {
    public Burger prepareBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}
