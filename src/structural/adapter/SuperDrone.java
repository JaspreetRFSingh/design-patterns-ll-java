package structural.adapter;

public class SuperDrone implements Drone{

	@Override
	public void beep() {
		System.out.println("BEEP!");
	}

	@Override
	public void spinRotors() {
		System.out.println("Spinning the turbo rotors!!");
	}

	@Override
	public void takeOff() {
		System.out.println("Taking off at 15mph!");
	}

}
