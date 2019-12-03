package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasicPage{
	private By companyName = By.name("business");
	private By industry = By.cssSelector("industry");
	private By role = By.name("functional_role");
	private By phone = By.name("phone");
	private By password = By.name("password");
	private By repeat = By.name("repeat_password");
	private By submit = By.cssSelector("[input-type='submit']");

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getElement (By element) {
		return this.driver.findElement(element);
	}
	
	public void clickOnLink(WebElement link) {
		link.click();
	}
	
	public List<WebElement> getRoles(){
		return this.driver.findElements(role);
		
	}
	
	public List<WebElement>getIndustry(){
		return this.driver.findElements(industry);
	}
	
	

}
