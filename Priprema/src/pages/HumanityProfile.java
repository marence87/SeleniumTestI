package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile extends BasicPage{
	private By avatar = By.id("tr_avatar");
	private By profile = By.cssSelector("a[href=\"https://sdn1.humanity.com/app/staff/detail/5243131/\"]");
	private By settings = By.cssSelector("a[href=\"https://sdn1.humanity.com/app/staff/edit/5243131/\"]");
	private By availability = By.cssSelector("a[href=\"https://sdn1.humanity.com/app/staff/availability/5243131/\"]");
	private By version = By.xpath("//*[@id=\"humanityAppVersion\"]/b");
	private By signOut = By.cssSelector("a[href=\"https://sdn1.humanity.com/app/logout/0/\"]");
	

	public HumanityProfile(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getProfile() {
		return this.driver.findElement(avatar);
	}
	
	public WebElement getProfileB(){
		return this.driver.findElement(profile);
	}
	
	public WebElement getSettings(){
		return this.driver.findElement(settings);
	}
	
	public WebElement getAvailability() {
		return this.driver.findElement(availability);
	}
	
	public WebElement getVersion() {
		return this.driver.findElement(version);
	}
	
	public WebElement getSignOut() {
		return this.driver.findElement(signOut);
	}

}
