package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageOpen {
	@FindBy(xpath="//*[text()='Admin']") //variables
	private WebElement AdminTab;
	
	@FindBy(xpath="(//*[@type='text'])[1]") //variables
	private WebElement SystemUser;
	
	public AdminPageOpen(WebDriver driver)   // adding constructor 
	{
      PageFactory.initElements(driver, this);
	}
	
	public void AdminPage ()   //methods
	{
		AdminTab.click();
	}
	public void InputInfo ()   //methods
	{
		SystemUser.sendKeys("ANNIEE");
	}
	
}
