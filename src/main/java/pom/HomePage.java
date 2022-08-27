package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//*[text()='Admin']") //variables
	private WebElement AdminTab;
	
	@FindBy(xpath="//*[text()='Recruitment']")
	private WebElement RecruitmentTab;
	
	@FindBy(xpath="//*[text()='Time']")
	private WebElement TimeTab;
	
	public HomePage (WebDriver driver)   // adding constructor 
	{
      PageFactory.initElements(driver, this);
	}
	 
	public void AdminPage ()   //methods
	{
		AdminTab.click();
	}
	public void RecruitmentPage()
	{
		RecruitmentTab.click();
	}
	public void TimePage()
	{
		TimeTab.click();
	}

}
