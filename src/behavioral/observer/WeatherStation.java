package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

	private double temperature;
	private double windspeed;
	private double pressure;
	List<Observer> observers = new ArrayList<Observer>();
	
	public WeatherStation() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void attachObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index<=0) {
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index>=0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, pressure, windspeed);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double windspeed, double pressure) {
		this.temperature = temperature;
		this.windspeed = windspeed;
		this.pressure = pressure;
		measurementsChanged();
	}


	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
}
