package creational.factory;

public class ChromeWebDriver implements WebDriver{

	@Override
	public void findDriver() {
		System.out.println("Chrome driver found!");
	}

	@Override
	public void getDriver() {
		System.out.println("Getting the chrome driver!!");
	}

}
