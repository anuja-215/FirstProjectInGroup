package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
@FindBy(xpath="//*[@id='welcome']")
private WebElement Welcome;

@FindBy(xpath="//*[text()='Logout']")
private WebElement Logout;


public LogoutPage (WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
public void WelcomeButton() 
{
	Welcome.click();

}
public void LogoutButton() 
{
	//Actions a=new Actions(driver);
	//a.moveToElement(Logout).build().perform();
	Logout.click();

}


}