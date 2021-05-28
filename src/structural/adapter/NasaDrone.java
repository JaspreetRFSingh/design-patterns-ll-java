package structural.adapter;

public class NasaDrone implements Drone{

	@Override
	public void beep() {
		System.out.println("BEEEEEEEP!!!!");
	}

	@Override
	public void spinRotors() {
		System.out.println("Spinning the rotors at 8900 rpm!");
	}

	@Override
	public void takeOff() {
		System.out.println("Taking off at 25mph!");
	}

}
