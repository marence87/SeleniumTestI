package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu extends BasicPage{
	private By settingsBt = By.cssSelector("a[href=\"/app/admin/\"]");
	private By shiftP = By.cssSelector(".primNavQtip__icon icon-shiftPlanning");
	private By timeClock = By.cssSelector("._primNavQtip j-primary-navigation-qtip  ");
	private By leave = By.linkText("Leave");
	

	public HumanityMenu(WebDriver driver) {
		super(driver);
	}
	
	private WebElement getSettingsBt() {
		return this.driver.findElement(settingsBt);
	}
	
	public WebElement getShift() {
		return this.driver.findElement(shiftP);
	}
	
	public WebElement getTime() {
		return this.driver.findElement(timeClock);
	}
	
	public WebElement getLeave() {
		return this.driver.findElement(leave);
	}
	

}
