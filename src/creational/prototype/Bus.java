package creational.prototype;

public class Bus extends Vehicle{
    protected Bus(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
