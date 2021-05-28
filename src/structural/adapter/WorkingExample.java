package structural.adapter;

public class WorkingExample {
	
	public static void main(String[] args) {
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);
		DuckSimulator duckSimulator = new DuckSimulator(droneAdapter);
		duckSimulator.testDuck();
	}
	
}
