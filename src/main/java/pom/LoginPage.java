package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='txtUsername']") //variables
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginbButton;
	
	public LoginPage (WebDriver driver)   // adding constructor 
	{
      PageFactory.initElements(driver, this);
	}
	 
	public void sendUsername()   //methods
	{
		Username.sendKeys("Admin");
	}
	public void sendPassword()
	{
		Password.sendKeys("admin123");
	}
	public void clickLoginbButton()
	{
		LoginbButton.click();
	}
	
}
