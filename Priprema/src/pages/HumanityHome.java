package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome extends BasicPage{
	
	private By about = By.cssSelector(".navbar-nav mr-auto");
	private By navTrail = By.cssSelector(".top-header .nav-trial a");
	private By start = By.linkText("START MY FREE TRIAL");
	private By name = By.name("fullname");
	private By email = By.name("workemail");
	private By submit = By.id("free-trial-link-01");

	public HumanityHome(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getName() {
		return this.driver.findElement(name);
	}
	
	public WebElement getLoginBtn() {
		return this.driver.findElements(navTrail).get(1);
	}
	
	public WebElement getEmail() {
		return this.driver.findElement(email);
	}
	
	public WebElement getSubmit() {
		return this.driver.findElement(submit);
	}
	
	public WebElement getAbout() {
		return this.driver.findElement(about);
	}

	

	
}
