package behavioral.observer;

public class WorkingExample {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		new Logger(weatherStation);
		new Alert(weatherStation);
		Observer userInterface = new UserInterface(weatherStation);
		weatherStation.setMeasurements(23.56, 623.48, 85.22);
		weatherStation.setMeasurements(56.96, 423.91, 43.77);
		weatherStation.removeObserver(userInterface);
		weatherStation.setMeasurements(26.96, 23.91, 43.75);
	}
}
