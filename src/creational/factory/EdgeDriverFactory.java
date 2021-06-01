package creational.factory;

public class EdgeDriverFactory extends WebDriverFactory{

	@Override
	public WebDriver CreateWebDriver() {
		return new EdgeWebDriver();
	}

}
