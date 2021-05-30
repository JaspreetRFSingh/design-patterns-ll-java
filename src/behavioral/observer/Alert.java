package behavioral.observer;

public class Alert implements Observer {
	WeatherStation weatherStation;

	public Alert(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.attachObserver(this);
	}

	@Override
	public void update(double temperature, double pressure, double windspeed) {
		System.out.println("\n----------\n");
		System.out.println("ALERT!!");
		System.out.println("Temperature: " + temperature);
		System.out.println("Pressure: " + pressure);
		System.out.println("Windspeed: " + windspeed);
	}
}
