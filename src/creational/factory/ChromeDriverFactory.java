package creational.factory;

public class ChromeDriverFactory extends WebDriverFactory{

	@Override
	public WebDriver CreateWebDriver() {
		return new ChromeWebDriver();
	}
	
}
