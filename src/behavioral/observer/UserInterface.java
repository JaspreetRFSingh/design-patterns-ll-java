package behavioral.observer;

public class UserInterface implements Observer {
	WeatherStation weatherStation;

	public UserInterface(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.attachObserver(this);
	}

	@Override
	public void update(double temperature, double pressure, double windspeed) {
		System.out.println("\n----------\n");
		System.out.println("UPDATING the UI!!");
		System.out.println("Temperature: " + temperature);
		System.out.println("Pressure: " + pressure);
		System.out.println("Windspeed: " + windspeed);
	}
}
