package creational.prototype;

import java.util.List;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int topSpeed;

    protected Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.topSpeed = vehicle.topSpeed;
    }

    public abstract Vehicle clone();
}
