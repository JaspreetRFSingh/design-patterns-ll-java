package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private String brand;
    private String model;
    private int topSpeed;

    public Car(Car car){
        super(car);
        this.brand =car.brand;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
