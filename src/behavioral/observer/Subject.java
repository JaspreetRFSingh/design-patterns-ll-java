package behavioral.observer;


public interface Subject {
	void attachObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
