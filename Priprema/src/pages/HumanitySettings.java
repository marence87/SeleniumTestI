package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanitySettings extends BasicPage{
	private By country = By.name("country");
	private By language = By.name("language");
	private By time = By.name("pref_24hr");

	public HumanitySettings(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement getCountry() {
		return this.driver.findElement(country);
	}
	
	private WebElement getLanguage() {
		return this.driver.findElement(language);
	}
	
	private WebElement getTime() {
		return this.driver.findElement(time);
	}

}
