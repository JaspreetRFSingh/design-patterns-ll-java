package behavioral.observer;

public class Logger implements Observer{

	WeatherStation weatherStation;
	
	public Logger(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.attachObserver(this);
	}
	
	@Override
	public void update(double temperature, double pressure, double windspeed) {
		System.out.println("\n----------\n");
		System.out.println("UPDATING the LOGS!!");
		System.out.println("Temperature: " + temperature);
		System.out.println("Pressure: " + pressure);
		System.out.println("Windspeed: " + windspeed);
	}

}
