package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff extends BasicPage{
	private By details = By.cssSelector("a[href=\"https://sdn1.humanity.com/app/staff/edit/5243131/\"]");
	private By upload = By.id("fileupload");

	public HumanityEditStaff(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getDetails() {
		return this.driver.findElement(details);
	}
	
	public WebElement getUpload() {
		return this.driver.findElement(upload);
	}

}
