package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class WorkingExample {

	public static void main(String[] args) {
		clone(null);
	}

	public static List<Vehicle> clone(List<Vehicle> vehicles) {
		List<Vehicle> copyVeh = new ArrayList<>();
		for(Vehicle veh : vehicles){
			copyVeh.add(veh.clone());
		}
		return copyVeh;
	}
}
