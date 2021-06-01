package creational.factory;

public class EdgeWebDriver implements WebDriver{
	@Override
	public void findDriver() {
		System.out.println("Edge driver found!");
	}

	@Override
	public void getDriver() {
		System.out.println("Getting the edge driver!!");
	}

	@Override
	public void run() {
		System.out.println("Edge browser running!");
	}
}
