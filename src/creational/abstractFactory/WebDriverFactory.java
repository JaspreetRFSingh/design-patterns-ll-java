package creational.abstractFactory;

public abstract class WebDriverFactory {
	
	WebDriver webdriver;
	
	public void startDriver() {
		webdriver = this.CreateWebDriver();
		webdriver.run();
	}

	public abstract WebDriver CreateWebDriver();
	
}
